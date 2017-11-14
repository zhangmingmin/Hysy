package com.cq.controller;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class UserController {

	public static void main(String [] args) {
		Resource resource = new ClassPathResource("conf/applicationContext.xml");
		try {
			InputStream in = resource.getInputStream();
			System.out.println(resource.getURL());
			System.out.println(resource.getURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
