package com.aws.spring_study;

import com.aws.spring_study.ioc_di.TestController;
import com.aws.spring_study.ioc_di.TestService;
import com.aws.spring_study.ioc_di.TestService1;
import com.aws.spring_study.ioc_di.TestService2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStudyApplication.class, args);
//		main2();
	}

	public static void main2() {
		TestService1 tsestService1 = new TestService1(); // 결합도 낮음
		TestService2 tsestService2 = new TestService2(); // 결합도 낮음
		TestController testController = new TestController(tsestService2);

//		TestController testController = new TestController(); // 결합도 높음
		testController.control();

	}
}
