package com.codet.back.custom.controller;

import java.io.File;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.map.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.codet.back.custom.mapper.CustomMapper;
import com.codet.back.custom.service.CustomBackService;
import com.codet.pojo.Custom;
import com.codet.pojo.CustomExtend;
import com.codet.pojo.CustomQueryPojo;
import com.codet.pojo.User;
import com.codet.util.CommonConstant;
import com.codet.util.IdUtil;


@Controller
@RequestMapping("/back/custom")
public class CustomController {

	@Autowired
	private CustomBackService customBackService;
	
	@Autowired
	private CustomMapper customMapper;
	
	//默认搜索的类型为id,模糊搜索内容为空
	private String searchType="id";
	private String searchValue="";
	
	@RequestMapping("customList")
	public String customList(String searchType,String searchValue,Model model) throws Exception{
		
		List<CustomExtend> customList=new ArrayList<>();
		
		if(searchType!=null&&searchType.equals("id")){
			Custom custom=customBackService.findCustomByCustomId(searchValue);
			CustomExtend customExtend=new CustomExtend();
			BeanUtils.copyProperties(custom, customExtend);
			customList.add(customExtend);
			} else{
			customList=customMapper.findCustomByName(searchValue);
			
		} 
		
		model.addAttribute(CommonConstant.CUSTOM_LIST, customList);
		
		return "page/back/custom_info/custom_list";
	}
	/*@RequestMapping("customList")
	public String customList(HttpSession session,@RequestParam(value="pageNo", defaultValue="0") int pageNo,@RequestParam(value="pageSize",defaultValue="10") int pageSize,@RequestParam(value="keyword",defaultValue="") String keyword,@RequestParam(value="city",defaultValue="2") int city, Model model) throws Exception {

		List<CustomExtend> customList = new ArrayList<>();
		
		CustomQueryPojo customQueryPojo=new CustomQueryPojo();
		customQueryPojo.setPageNo(pageNo);
		customQueryPojo.setPageSize(pageSize);
		customQueryPojo.setSearchType(searchType);
		customQueryPojo.setKeyword(keyword);
		
		customList=customBackService.findPageCustomByCustomid(customQueryPojo);
		int count=customBackService.findCustomAllCount(customQueryPojo);
		model.addAttribute(CommonConstant.CUSTOM_LIST, customList);
		model.addAttribute("pageNo", pageNo);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("keyword", keyword);
		model.addAttribute("count", count);
		model.addAttribute("keyword", keyword);
		model.addAttribute("searchType", searchType);
		return "page/back/custom_info/custom_list";
	}

	@RequestMapping("/findPageCustomAjax")
	public @ResponseBody CustomQueryPojo findPageCustomAjax(int pageNo,int pageSize,String searchType,String keyword) throws Exception{
		//页面中文keyword乱码处理
		keyword=URLDecoder.decode(keyword,"utf-8");
		CustomQueryPojo customQueryPojo=new CustomQueryPojo();
		customQueryPojo.setPageNo(pageNo);
		customQueryPojo.setPageSize(pageSize);
		customQueryPojo.setSearchType(searchType);
		customQueryPojo.setKeyword(keyword);
		customQueryPojo.setCount(customBackService.findCustomAllCount(customQueryPojo));
		customQueryPojo.setCustomExtends(customBackService.findPageCustomBySearchtype(customQueryPojo));
		
		return customQueryPojo;
	}*/
	
	@RequestMapping("insertCustom")
	public String insertCustom(CustomExtend customExtend,
			MultipartFile custompic,String yyyy,String MM,String dd,HttpServletRequest request)
			throws Exception {
		// MultipartFile custompic用来接收客户图片
		if (custompic != null) {
			 // 上传文件路径  
			String uploadPath = request.getSession().getServletContext().getRealPath("/upload");
			String fileName=custompic.getOriginalFilename();
			String newFileName=UUID.randomUUID()+
					fileName.substring(
					fileName.lastIndexOf("."));
			String path=uploadPath+File.separator;
			File newFile=new File(path+newFileName);
			custompic.transferTo(newFile);
			customExtend.setPic(newFileName);
		}
		customBackService.insertCustom(customExtend);
		return "page/back/custom_info/success";
	}

	// 商品修改信息修改页面显示
	@RequestMapping("updateCustom")
	public String updateCustom(String customId,Model model) throws Exception {
		//先在Custom中取得customId，然后复制给扩展类CustomExtend接收
		Custom customUpdate = customBackService.findCustomByCustomId(customId);
		CustomExtend customExtend=new CustomExtend();
		BeanUtils.copyProperties(customUpdate, customExtend);
		model.addAttribute(CommonConstant.CUSTOM_UPDATE, customExtend);
		return "page/back/custom_info/custom_update";
	}

	// 商品信息修改提交
	@RequestMapping("updateCustomSubmit")
	public ModelAndView updateCustomSubmit(CustomExtend customExtend) throws Exception {
		customBackService.updateCustom(customExtend);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/back/custom_info/success");
		return modelAndView;
	}
	//删除客户信息
	@RequestMapping("deleteCustomByCustomid")
	public String deleteCustomByCustomid(String customid)throws Exception{
		customBackService.deleteCustomByCustomid(customid);
		return "page/back/custom_info/success";
	}
	//查看客户详情
	@RequestMapping("selectCustom")
	public String  selectCustom(String customid,Model model)throws Exception{
		CustomExtend customExtend=customBackService.selectCustom(customid);
		model.addAttribute(CommonConstant.COUSTOM_DETAILS,customExtend);
		return "page/back/custom_info/custom_details";
	}
}
