package com.resturant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resturant.dao.ClientRepository;
import com.resturant.entities.ClientUser;

@Service
public class ResService 
{
	@Autowired
	private ClientRepository clientRepository;
	
	public void addDetails(ClientUser user)
	{
		clientRepository.save(user);
	}

	public int check(String clientEmail,String password) {
		{
			int i = 0;
			
			String email=clientRepository.checking(password);
			if(clientEmail==email)
			{
				i=1;
			}
			return i;
			
		}
		
	}
}
