package com.stoktakipcompany.stoktakip.service;

import java.util.List;

import com.stoktakipcompany.stoktakip.pojo.User;

public interface UserService {

	public User create(User user);
	public User delete(Long id) ;
	public List findAll();
	public User update(User user);
	public User findById(Long id);

	
	
}
