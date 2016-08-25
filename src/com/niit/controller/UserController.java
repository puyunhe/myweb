package com.niit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.model.Users;
import com.niit.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	 
	 @Autowired
	 private UserService userService;
	 
	 @RequestMapping("/addUser")  
	 public String addUser(Users user){
		userService.addUser(user);
		return "redirect:/user/getAll";  
	 }
	 
	 @RequestMapping("/toAddUser")  
	 public String toAddUser(){
		 return "/addUser"; 
	 }
	 
	 @RequestMapping("/getAll")  
	 public String getAll(HttpServletRequest request){
		 List<Users> users=userService.getAll();
		 request.setAttribute("users", users);
		 return "/userList";
	 }
	 
	 @RequestMapping("/deleteUser")
	 public void deleteUser(String id,HttpServletResponse response){
		String result="{\"result\":\"error\"}"; 
		if(userService.deleteUser(id)){
			result="{\"result\":\"success\"}";
		}
		response.setContentType("application/json");
		try{
			PrintWriter out=response.getWriter();
			out.write(result);
		}catch(IOException e){
			e.printStackTrace();
		}
	 }
	 
	 @RequestMapping("/getUser")
	 public String getUser(String id,HttpServletRequest request){
		 Users user=userService.getUser(id);
		 request.setAttribute("user", user);
		 return "/editUser"; 
	 }
	 
	 @RequestMapping("/modifyUser")  
	    public String modifyUser(Users user){  
	        if(userService.modifyUser(user)){  
	            return "redirect:/user/getAll";  
	        }else{  
	            return "/error";  
	        }  
	    }  
	  
}
