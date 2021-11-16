package com.wjk.recruit_pjt.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wjk.recruit_pjt.HomeController;

@Controller
public class JoinController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/join")
	public String join(Locale locale) {
		
		return "/member/join";
	}
}
