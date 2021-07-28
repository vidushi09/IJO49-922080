package com.aws.beanstalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsBeanstalkDeployExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsBeanstalkDeployExampleApplication.class, args);
	}
	@GetMapping("/")
	public String welcome()
	{
		return "welcome to AWS Elastic Beanstalk ";
	}
	@GetMapping("/hello/{name}")
	public String welcome(@PathVariable String name)
	{
		return "Hi "+name+", welcome to AWS Elastic Beanstalk ";
	}

}
