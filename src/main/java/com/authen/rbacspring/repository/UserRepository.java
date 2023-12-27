package com.authen.rbacspring.repository;

import com.authen.rbacspring.entity.Role;
import com.authen.rbacspring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    User findByRole(Role role);

}
