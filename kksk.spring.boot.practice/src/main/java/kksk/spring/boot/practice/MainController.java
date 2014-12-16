package kksk.spring.boot.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@ComponentScan
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

	@RequestMapping("/p3")
	public String move3() {
		return "page3";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "actuator";
	}

	public static void main(String[] args) {
		//Object[] controllers = { MainController.class, RestfulController.class };
		SpringApplication.run(MainController.class, args);
	}

}
