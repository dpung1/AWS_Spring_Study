package com.aws.spring_study.ioc_di;

public class TestController {
//    private TestService1 t;
    private TestService t;

//    public TestController() { // 결합도 높음
//        t = new TestService1();
//
//    }

//    public TestController(TestService1 t) { // 결합도 낮음
//        this.t = t;
//    }

    public TestController(TestService t) { // 결합도 낮음
        this.t = t;
    }

    public void control() {
        t.aaa();
    }
}
