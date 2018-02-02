package com.desta.auth.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.desta.auth.models.*;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username);

}
