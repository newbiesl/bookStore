package com.bookStore.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.domain.User;
import com.bookStore.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "uname", defaultValue = "", required = false) String uname,
			@RequestParam(value = "pwd", defaultValue = "", required = false) String pwd) {
		ModelAndView mv = new ModelAndView();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userName", uname);
		params.put("userPwd", pwd);
		User user = this.userService.selectUser(params);
		mv.setViewName("/index.jsp");
		if(user == null) {
			mv.addObject("errorMsg", "输入的用户名或密码错误，请重新输入");
			mv.setViewName("/account.jsp");
		}
		return mv;
	}
	
	@ResponseBody
	@RequestMapping("/register")
	public Map<String, Object> register(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "uname", defaultValue = "", required = false) String uname,
			@RequestParam(value = "pwd", defaultValue = "", required = false) String pwd) {
		Map<String, Object> rtn = new HashMap<String, Object>();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("userName", uname);
		User user = this.userService.selectUser(params);
		if(user != null) {
			rtn.put("result", "failure");
			rtn.put("msg", "该用户已存在");
		} else {
			// 查询用户名不存在数据库中，则插入一条数据
			user = new User();
			user.setUserName(uname);
			user.setUserPwd(pwd);
			int saveNum = this.userService.saveUser(user);
			if(saveNum > 0) {
				rtn.put("result", "success");
			}
		}
		return rtn;
	}
}

