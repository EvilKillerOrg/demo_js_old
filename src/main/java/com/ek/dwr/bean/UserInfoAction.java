package com.ek.dwr.bean;

import java.util.ArrayList;
import java.util.List;

import com.ek.dwr.vo.UserInfoVO;

public class UserInfoAction {
	
	private static List<UserInfoVO> userList = new ArrayList<UserInfoVO>();
	static{
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
	}
	
	public void updateUserInof(UserInfoVO user){
		 Integer uuidInteger = Integer.valueOf(user.getUuid());
		 UserInfoVO userTemp = userList.get(uuidInteger-1);
		 userTemp.setUsername(user.getUsername());
		 userTemp.setPassword(user.getPassword());
	}
	
	
	public UserInfoVO getUserById(String uuid){
		 Integer uuidInteger = Integer.valueOf(uuid);
		return userList.get(uuidInteger-1);
	}
	
	
	public void saveUserInfo(UserInfoVO user){
		user.setUuid(userList.size()+1+"");
		userList.add(user);
	}
	
	
	public List<UserInfoVO> findAllUserInfo(){
		
		return userList;
	}
	
	
	
	
	
	
	
	/////////////////////////////////////////////////////////////////////////////////
	public UserInfoVO getUserInfo(){
		UserInfoVO user = new UserInfoVO();
		user.setUuid("1");
		user.setUsername("homer");
		user.setPassword("111");
		
		System.out.println("走  getUserInfo");
		return user;
	}
}