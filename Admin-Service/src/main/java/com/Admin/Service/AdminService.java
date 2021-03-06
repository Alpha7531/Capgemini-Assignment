package com.Admin.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.Admin.Model.AdminModel;
import com.Admin.Repository.AdminRepository;
@Service
public class AdminService implements UserDetailsService{

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public UserDetails loadUserByUsername(String adminname) throws UsernameNotFoundException {
		AdminModel foundedUser = adminRepository.findByAdminname(adminname);
		// TODO Auto-generated method stub
		if(foundedUser==null)
			return null;
		String name = foundedUser.getAdminname();
		String pwd = foundedUser.getPassword();
		return new User(name,pwd,new ArrayList<>());
	}

}
