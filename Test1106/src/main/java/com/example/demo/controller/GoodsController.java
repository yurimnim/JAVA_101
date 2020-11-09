package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService gs;
	
	@GetMapping("/list")
	private void list(Model model) {
		System.out.println("컨트롤러 ok");
		model.addAttribute("list", gs.findAll());
	}
}
