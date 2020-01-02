package com.entor.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entor.entity.User;

@Controller
public class ThymeleafController {
    
	private List<User> list;
	
	@RequestMapping("/a")
	public String b(Map<String,Object> map,User user) {
	  
		map.put("name", "汉尼拔");
		user.setId("001");
		user.setUsername("Hannibal");
		user.setPassword("123456");
		map.put("user", user);
		List<User> list = new ArrayList<>();
		for (int i = 1; i <=10; i++) {
			
			 User user1 = new User();
			 user1.setId("00"+i);
			 user1.setUsername("王五"+i);
			 user1.setPassword("66666"+i);
			 list.add(user1);
			
		}
		 map.put("list", list);
		return "index";
	
		
	}
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public Map<String,Object> queryAll(Map<String,Object> map) {
		
		
		User user = new User();
		List<User> list = new ArrayList<>();
		for (int i = 1; i <= 50; i++) {
			user.setId("0"+i);
			user.setUsername("范健"+i);
			user.setPassword("1234"+i);
			
			list.add(user);
		}
		map.put("user", user);
		
		return map;
		

	}
	@RequestMapping("/add")
	public String add(Map<String,Object> map) {

		User user = new User();
		List<User> list = new ArrayList<>();
		for (int i = 1; i <= 50; i++) {
			user.setId("0"+i);
			user.setUsername("范健"+i);
			user.setPassword("1234"+i);
			
			
			if(user.getId()!=null) {
				user.setId("0"+i);
				user.setUsername("范健"+i);
				user.setPassword("1234"+i);
				
				break;
			}
			list.add(user);
		}
		map.put("user", user);
		
		return "add";
	}
	@RequestMapping("/update")
	public String update(Map<String,Object> map) {
		User user = new User();
		List<User> list = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			user.setId("0"+i);
			user.setUsername("范建"+i);
			user.setPassword("123"+i);
		}
		map.put("user", user);
		return "index";
	}
	
	public String deleteById(Map<String,Object> map,String id) {
		User user =  new User();
		int uid = Integer.parseInt(id);
		for (int i = 0; i < list.size(); i++) {
		
		}
		
		
		return "";
	}
}
