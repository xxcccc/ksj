package com.codet.back.custom.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.codet.back.custom.mapper.CustomMapper;
import com.codet.back.custom.service.CustomBackService;
import com.codet.pojo.Custom;
import com.codet.pojo.CustomExtend;
import com.codet.pojo.CustomQueryPojo;
import com.codet.util.CommonConstant;
import com.codet.util.IdUtil;


@Controller
@RequestMapping("/back/custom")
public class CustomController {

	@Autowired
	private CustomBackService customService;
	
	@Autowired
	private CustomMapper customMapper;
	
	//默认搜索的类型为id,模糊搜索内容为空
	private String searchType="id";
	private String searchValue="";
	
	@RequestMapping("customList")
	public String customList(String searchType,String searchValue,Model model) throws Exception{
		
		List<CustomExtend> customList=new ArrayList<>();
		
		if(searchType!=null&&searchType.equals("id")){
			Custom custom=customService.findCustomByCustomId(searchValue);
			CustomExtend customExtend=new CustomExtend();
			BeanUtils.copyProperties(custom, customExtend);
			customList.add(customExtend);
			} else{
			customList=customMapper.findCustomByName(searchValue);
			
		} 
		
		model.addAttribute(CommonConstant.CUSTOM_LIST, customList);
		
		return "page/back/custom_info/custom_list";
	}
	
	@RequestMapping("insertCustom")
	public String insertCustom(CustomExtend customExtend,MultipartFile custompic,HttpServletRequest request) throws Exception {
		//MultipartFile custompic用来接收客户图片
		if (custompic!=null) {
			//保存图片
			//String pic_path = request.getSession().getServletContext().getRealPath("/upload");

			String pic_path="F:\\develop\\upload\\temp\\";
			String originalFilename=custompic.getOriginalFilename();//原始名称
			//新的图片名称
			String newFileName=UUID.randomUUID()+
					originalFilename.substring(
					originalFilename.lastIndexOf("."));
			//新的图片
			File newFile=new File(pic_path+newFileName);
			//将内存中的数据写入磁盘
			custompic.transferTo(newFile);
			//将新的图片名称上传到数据库中Custom表的pic属性
			customExtend.setPic(newFileName);
		}
		//custom.setCustomid(IdUtil.getUUID());//随机ID
		customService.insertCustom(customExtend);

		return "page/back/custom_info/success";
	}

	// 商品修改信息修改页面显示
	@RequestMapping("updateCustom")
	public String updateCustom(String customId,Model model) throws Exception {
		//先在Custom中取得customId，然后复制给扩展类CustomExtend接收
		Custom customUpdate = customService.findCustomByCustomId(customId);
		CustomExtend customExtend=new CustomExtend();
		BeanUtils.copyProperties(customUpdate, customExtend);
		model.addAttribute(CommonConstant.CUSTOM_UPDATE, customExtend);
		return "page/back/custom_info/custom_update";
	}

	// 商品信息修改提交
	@RequestMapping("updateCustomSubmit")
	public ModelAndView updateCustomSubmit(CustomExtend customExtend) throws Exception {
		customService.updateCustom(customExtend);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("page/back/custom_info/success");
		return modelAndView;
	}
	//删除客户信息
	@RequestMapping("deleteCustomByCustomid")
	public String deleteCustomByCustomid(String customid)throws Exception{
		customService.deleteCustomByCustomid(customid);
		return "page/back/custom_info/success";
	}
	//查看客户详情
	@RequestMapping("selectCustom")
	public String  selectCustom(String customid,Model model)throws Exception{
		CustomExtend customExtend=customService.selectCustom(customid);
		model.addAttribute(CommonConstant.COUSTOM_DETAILS,customExtend);
		return "page/back/custom_info/custom_details";
	}
}
