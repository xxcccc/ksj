package com.codet.front.custom.controller;

import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.codet.front.custom.service.CustomFrontService;
import com.codet.pojo.Custom;
import com.codet.pojo.CustomExtend;
import com.codet.util.CommonConstant;
import com.codet.util.IdUtil;

@Controller
@RequestMapping("/front/custom")
public class CustomFrontController {

	@Autowired
	private CustomFrontService customFrontServiceService;
	private String searchType="id";
	private String searchValue="";
	
	@RequestMapping("login")
	public String customLogin(Custom custom,Model model,HttpSession session) throws Exception{
		
		if(customFrontServiceService.login(custom)){
			Custom custom2 = customFrontServiceService.findCustomByName(custom.getCustomname());
			session.setAttribute("name", custom2);
			
			CustomExtend customExtendM=customFrontServiceService.findCustomMessageResultMap(custom2.getCustomid());
			CustomExtend customExtendC=customFrontServiceService.findCustomByCustomId(custom2.getCustomid());
			model.addAttribute(CommonConstant.Message_LIST, customExtendM);
			model.addAttribute(CommonConstant.CUSTOM_LISTC, customExtendC);
			model.addAttribute(CommonConstant.CUSTOM_CONTEXT, custom2);
			return "index2";
		}else{
			String message ="用户名或者密码错误";
			model.addAttribute(CommonConstant.LOGIN_MESSAGE,message);
			//return null;
			return "redirect:../../page/front/custom_info/login.jsp";
		}
	}
	//退出登录
	@RequestMapping("logoutCustom")
	public String logoutCustom(HttpSession session) throws Exception{
		session.removeAttribute(CommonConstant.CUSTOM_CONTEXT);
		return "login2";
	}
	
	@RequestMapping("registerFrontCustom")
	public String insertCustom(CustomExtend customExtend,HttpServletRequest request)
			throws Exception {
		customFrontServiceService.registerFrontCustom(customExtend);
		return "login2";
	}
		
	//查看客户详情
	@RequestMapping("selectFrontCustom")
	public String  selectFrontCustom(String customid,Model model,HttpSession session)throws Exception{
		CustomExtend customExtend=new CustomExtend();
		Custom custom =new Custom();
		custom=(Custom) session.getAttribute("name");
		customExtend=customFrontServiceService.selectFrontCustom(custom.getCustomid());
		System.out.println("============"+customExtend.getCustomid());
			model.addAttribute(CommonConstant.COUSTOM_DETAILS,customExtend);
			return "page/front/custom_info/form-elements";
			}
		// 客户信息修改提交
		@RequestMapping("updateCustomSubmit")
		public String updateCustomSubmit(CustomExtend customExtend,
				HttpServletRequest request,Model model,HttpSession session,MultipartFile custompic)throws Exception{
			if (!custompic.isEmpty()) {
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
			Custom custom2 = customFrontServiceService.findCustomByName(customExtend.getCustomname());
			session.setAttribute("name", custom2);
			
			customExtend.setPassword(IdUtil.md5(customExtend.getPassword()));
			customFrontServiceService.updateCustom(customExtend);
			System.out.println("============"+customExtend.getSex());
			CustomExtend customExtendM=customFrontServiceService.findCustomMessageResultMap(custom2.getCustomid());
			CustomExtend customExtendC=customFrontServiceService.findCustomByCustomId(custom2.getCustomid());
			model.addAttribute(CommonConstant.Message_LIST, customExtendM);
			model.addAttribute(CommonConstant.CUSTOM_LISTC, customExtendC);
			model.addAttribute(CommonConstant.CUSTOM_CONTEXT, custom2);
			return "index2";
		}
}
