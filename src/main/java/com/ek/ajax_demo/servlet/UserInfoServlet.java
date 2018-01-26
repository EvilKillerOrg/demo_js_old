package com.ek.ajax_demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ek.ajax_demo.vo.UserInfoVO;

public class UserInfoServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<UserInfoVO> userList = new ArrayList<>();
		UserInfoVO user1 = new UserInfoVO();
		user1.setUuid("1");
		user1.setUsername("homer");
		user1.setPassword("111");
		UserInfoVO user2 = new UserInfoVO();
		user2.setUuid("2");
		user2.setUsername("robin");
		user2.setPassword("222");
		UserInfoVO user3 = new UserInfoVO();
		user3.setUuid("3");
		user3.setUsername("hehe");
		user3.setPassword("333");
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		StringBuffer xmlData = new StringBuffer("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
		xmlData.append("<UserInfoList>\r\n"); //跟标签 只出现一次 放外面
		for (UserInfoVO userInfoVO : userList) {
			xmlData.append("<UserInfo>\r\n");
			xmlData.append("<uuid>").append(userInfoVO.getUuid()).append("</uuid>\r\n");
			xmlData.append("<username>").append(userInfoVO.getUsername()).append("</username>\r\n");
			xmlData.append("<password>").append(userInfoVO.getPassword()).append("</password>\r\n");
			xmlData.append("</UserInfo>\r\n");
		}
		xmlData.append("</UserInfoList>\r\n");
		
		response.setContentType("text/xml");
		PrintWriter out = response.getWriter();
		out.println(xmlData.toString());
		//System.out.println(xmlData.toString());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	

}