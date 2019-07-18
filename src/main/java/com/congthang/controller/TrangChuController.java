package com.congthang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
@ResponseBody
public class TrangChuController {
	@GetMapping("")
	public String TrangChu() {
		return "trangchu";
	}
	@PostMapping("login")
	public String Login(@PathVariable String user, @PathVariable String pass, ModelMap map) {
		
		if(user.equals("thang")&&pass.equals("1234")) {
			map.addAttribute("thongbao","ok");
			return "trangchu";
		}else{
			map.addAttribute("thongbao","false");
			return "trangchu";
		}
	}
}
