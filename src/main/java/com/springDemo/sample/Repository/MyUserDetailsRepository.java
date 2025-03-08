package com.springDemo.sample.Repository;

import com.springDemo.sample.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyUserDetailsRepository extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);
}
