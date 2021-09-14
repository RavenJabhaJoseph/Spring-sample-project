package com.example.db_connect;

import org.springframework.data.repository.CrudRepository;
import com.example.db_connect.User;
public interface UserRepository extends CrudRepository<User, Integer> {

}
