package com.SBI.onlinepay.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SBI.onlinepay.Entity.Student;
import com.SBI.onlinepay.Service.Service;

@Controller
public class HomeController {

	@Autowired
	private Service hs;

	@RequestMapping("/")
	public String getpage() {
		return "index";
	}

	@RequestMapping("reg")
	public String getRegister(@ModelAttribute Student s) {
		System.out.println("student data:-" + s);
		hs.addcustomer(s);
		return "login";
	}

}
