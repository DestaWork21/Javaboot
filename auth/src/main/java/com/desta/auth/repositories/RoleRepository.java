package com.desta.auth.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.desta.auth.models.*;
@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

	List<Role> findByName(String name);



}
