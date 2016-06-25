package com.stoktakipcompany.stoktakip.serviceImpl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stoktakipcompany.stoktakip.pojo.User;
import com.stoktakipcompany.stoktakip.repo.UserRepository;
import com.stoktakipcompany.stoktakip.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRap;

	@Override
	@Transactional
	public User create(User user) {
		User userCreate = user;

		return userRap.save(userCreate);
	}

	@Override
	public User delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
