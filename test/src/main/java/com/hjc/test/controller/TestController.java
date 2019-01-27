/**
 * FileName:         Test.java
 * @Description:     TODO
 * @author:            mojianyou
 * @version            V1.0
 * Createdate:      2019年1月27日     上午10:43:40
 * Copyright:        Copyright(C) 2019
 * Company           HJC.
 * All rights Reserved, Designed By mojianyou

 * Modification  History:
 * Date         Author        Version        Discription
 * ---------------------------------------------------------------------------
 * 2019年1月27日     mojianyou       0.0.1             0.0.1

 * Why & What is modified:

 */
package com.hjc.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName:       Test
 * @Description:    TODO
 * @author:            mojianyou
 * @date:            2019年1月27日        上午10:43:40
 */
@RestController
public class TestController {

	@GetMapping("t1")
	public String test1()
	{
		return "hello world";
	}
	
}
