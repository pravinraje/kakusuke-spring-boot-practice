package kksk.spring.boot.practice.component.impl;

import kksk.spring.boot.practice.component.UserComponent;
import kksk.spring.boot.practice.model.User;
import kksk.spring.boot.practice.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

@Component("userComponent")
@Transactional
class UserComponentImpl implements UserComponent {
	private UserRepository userRepository;

	@Autowired
	public UserComponentImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public Page<User> findAllUsers(Pageable pageable) {
		return userRepository.findAll(pageable);
	}

	@Override
	public User findUserByName(String name) {
		Assert.notNull(name, "Name must not be null");
		return userRepository.findOne(name);
	}

	@Override
	public boolean login(String name, String password) {
		Assert.notNull(name, "Name must not be null");
		Assert.notNull(password, "Password must not be null");
		User user = findUserByName(name);
		if (user == null)
			return false;
		return password.equals(user.getPassword());
	}

}
