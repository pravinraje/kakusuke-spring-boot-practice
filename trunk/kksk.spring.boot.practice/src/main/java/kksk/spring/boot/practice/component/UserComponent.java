package kksk.spring.boot.practice.component;

import kksk.spring.boot.practice.model.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserComponent {
	Page<User> findAllUsers(Pageable pageable);

	User findUserByName(String name);

	boolean login(String name, String password);
}
