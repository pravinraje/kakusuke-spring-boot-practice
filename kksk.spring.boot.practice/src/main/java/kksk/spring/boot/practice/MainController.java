package kksk.spring.boot.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class MainController {

	@RequestMapping("/p1")
	public String move1(Model model) {
		model.addAttribute("message", "Message 1");
		return "page1";
	}

	@RequestMapping("/p2")
	public String move2(Model model) {
		model.addAttribute("message", "Message 2");
		return "page2";
	}

	public static void main(String[] args) {
		SpringApplication.run(MainController.class, args);
	}

}
