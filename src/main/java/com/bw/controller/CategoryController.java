package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.service.CategoryService;
import com.bw.utils.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService cs;
	
	@RequestMapping("list")
	public String getList(@RequestParam(defaultValue="1")int pageNum, Model mod) {
		
		PageHelper.startPage(pageNum, 2);
		
		List list = cs.list();
		
		PageInfo info = new PageInfo(list);
		
		Page.fenye(mod, info, "");
		
		mod.addAttribute("list", list);
		mod.addAttribute("info", info);
		mod.addAttribute("pageNum", pageNum);
		return "list";
	}
}
