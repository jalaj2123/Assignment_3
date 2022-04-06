package com.resturant.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.resturant.entities.ClientUser;

public interface ClientRepository extends CrudRepository<ClientUser,Integer>
{
@Query("select email from client_user where passowrd=:n")
public String checking(String password);
}
