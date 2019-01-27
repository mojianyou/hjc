/**
 * FileName:         App.java
 * @Description:     TODO
 * @author:            mojianyou
 * @version            V1.0
 * Createdate:      2019年1月27日     上午10:41:07
 * Copyright:        Copyright(C) 2019
 * Company           HJC.
 * All rights Reserved, Designed By mojianyou

 * Modification  History:
 * Date         Author        Version        Discription
 * ---------------------------------------------------------------------------
 * 2019年1月27日     mojianyou       0.0.1             0.0.1

 * Why & What is modified:

 */
package com.hjc.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;




/**
 * @ClassName:       App
 * @Description:    TODO
 * @author:            mojianyou
 * @date:            2019年1月27日        上午10:41:07
 */
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class}) 
@SpringBootApplication
public class App {

public static void main(String[] args) {
		
		SpringApplication.run(App.class,args);
	}
}
