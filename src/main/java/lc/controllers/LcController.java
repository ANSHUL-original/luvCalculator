package lc.controllers;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lc.api.LcDto;
 
public class LcController {

	@RequestMapping("/")
	public String home(@ModelAttribute("lcDto1") LcDto lcDto1,BindingResult result,HttpServletRequest req) {
		//this is for cookies method master
//	it ba	Cookie[] cookies=req.getCookies();
//		if(cookies==null)
//		{ 
//			return "home";
//		}
//		for(Cookie c:cookies) {
//			if("userName".equals(c.getName())) {
//				lcDto.setUserName(c.getValue());
//			}
//		}
	
		HttpSession session=req.getSession();
		if(session==null) {
//			System.out.println(lc.getUserName());
			System.out.println("null");
			
		}
		
		return "home";
	}
	
	@RequestMapping(value="/calc",method = RequestMethod.POST)
	public String calculate(@ModelAttribute("lcDto") LcDto lcDto,BindingResult result,HttpServletRequest req,HttpServletResponse res) {
		System.out.println("inside calculate method");
		HttpSession session=req.getSession();
		session.setAttribute("lcDto", lcDto);

//		Cookie cookie=new Cookie("userName", lcDto.getUserName());
//		res.addCookie(cookie);
		
		if(result.hasErrors()) {
			List<ObjectError> errors=result.getAllErrors();
			for(ObjectError oe:errors) {
				System.out.println(oe);
			}
			return "home";
		}
//		lcDto.setUserName(cookie.getValue());
		return "dashboard";
	}
	
}