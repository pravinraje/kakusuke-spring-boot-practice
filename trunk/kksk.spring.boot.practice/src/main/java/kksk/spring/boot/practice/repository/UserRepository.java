package kksk.spring.boot.practice.repository;

import kksk.spring.boot.practice.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
