package lc.controllers;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lc.api.EmailDto;

@Controller
public class EmailController {
	
	@RequestMapping("/email-redirection")
	public String emailRedirection(@ModelAttribute("emailDto") EmailDto emailDto,BindingResult result) {
		return "email-sending-page";
	}
	@RequestMapping("/email-send")
	public String emailSend(@ModelAttribute("emailDto") EmailDto emailDto,BindingResult result,HttpServletRequest req,HttpServletResponse res,Model model) {
		System.out.println("inside email send method");
//		HttpSession session=req.getSession(false);
//		LcDto lcDto=(LcDto)session.getAttribute("lcDto");
//		System.out.println("welcome "+lcDto.getUserName());
		
		
		if(result.hasErrors()) {
			List<ObjectError> list=result.getAllErrors();
			for(ObjectError e:list) {
				System.out.println(e);
			}
			return "email-sending-page";
		}
 		
//		String name=null;
//		Cookie[] cookies=req.getCookies();
		
//		for(Cookie c:cookies) {
//			if("userName".equals(c.getValue()))
//			{
//				System.out.println("2222");
//			} 
//		}
//		System.out.println(name);
//		model.addAttribute("name", name);
		ModelAndView modelAndView=new ModelAndView("email-send-confirm");
//		modelAndView.addObject(lcDto);
//		modelAndView.addObject("nameq","ANshuk");
		
		return "email-send-confirm";
	}
	
	
}
