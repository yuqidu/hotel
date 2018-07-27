package com.orilore.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.orilore.biz.IKindsBiz;
import com.orilore.model.Kinds;


@Controller
public class demo{
	public String index(){
		return "index";
	}
}