package com.rolandoroz.simpleblogapp.repository;

import com.rolandoroz.simpleblogapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
