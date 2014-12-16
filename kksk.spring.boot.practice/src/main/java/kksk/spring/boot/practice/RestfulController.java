package kksk.spring.boot.practice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class RestfulController {

	@RequestMapping(value = "/restSample", method = RequestMethod.POST)
	public String restSample_POST() {
		return "sampleMessage:POST";
	}

	@RequestMapping(value = "/restSample", method = RequestMethod.GET)
	public String restSample_GET() {
		return "sampleMessage:GET";
	}

	@RequestMapping(value = "/restSample", method = RequestMethod.PUT)
	public String restSample_PUT() {
		return "sampleMessage:PUT";
	}

	@RequestMapping(value = "/restSample", method = RequestMethod.DELETE)
	public String restSample_DELETE() {
		return "sampleMessage:DELETE";
	}
}
