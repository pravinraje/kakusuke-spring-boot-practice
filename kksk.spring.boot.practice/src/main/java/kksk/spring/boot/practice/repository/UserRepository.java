package kksk.spring.boot.practice.repository;

import kksk.spring.boot.practice.model.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<User, Long> {
	Page<User> findAll(Pageable pageable);

	User findByName(String name);
}
