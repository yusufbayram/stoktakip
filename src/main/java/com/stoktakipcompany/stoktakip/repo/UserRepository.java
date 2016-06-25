package com.stoktakipcompany.stoktakip.repo;
 import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stoktakipcompany.stoktakip.pojo.User;
 
public interface UserRepository extends JpaRepository <User,Long > {

	
	//List<User> findByAdi(String adi);
	
/*  burada kendi metodlarýmýzý yazabiliriz spring datanýn saðladýklarý
 *    dýþýnda özelleþtirebiliriz    */


}
