package com.study.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @Title:HelloWorldController.java
 * @Package:com.study.boot.controller
 * @Description:
 * @author:yangrong
 * @date:2018年9月5日上午2:11:37
 * @updater:
 * @version:V1.0
 * @updates:
 */
@RestController
public class HelloWorldController {
	@RequestMapping
	public String index() {
		return "hello word";
	}
}
