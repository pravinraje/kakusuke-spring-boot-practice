package kksk.spring.boot.practice;

import kksk.spring.boot.practice.component.UserComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserComponent userComponent;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam String name, @RequestParam String password) {
		if (userComponent.login(name, password))
			return "true";
		return "false";
	}
}
