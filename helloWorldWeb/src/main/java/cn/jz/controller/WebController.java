package cn.jz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.jz.bean.Student;

@Controller
public class WebController {

	@RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	public String redirectStatic() {
		return "redirect:/pages/final.htm";
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirectJSP() {
		return "redirect:finalPage";
	}
	
	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage() {
		return "final";
	}
	
	@RequestMapping(value = "/studentPag", method = RequestMethod.GET)
	public ModelAndView studentPag() {
		return new ModelAndView("student", "command", new Student());
	}
}
