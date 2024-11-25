package com.telusko;


import com.telusko.appConfig.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop obj = context.getBean("getDesktop",Desktop.class);
        obj.compile();




//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien obj1 = (Alien) context.getBean("alien");
//
//        System.out.println(obj1.getAge());
//        obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien");
//        obj2.code();
////
//        System.out.println(obj2.getAge());

    }
}
