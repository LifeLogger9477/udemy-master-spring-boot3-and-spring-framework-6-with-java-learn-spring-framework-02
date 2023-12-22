package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */
public class App02HelloWorldSpring {

  public static void main(String[] args) {

    // 1: Launch a Spring Context
    var context =
        new AnnotationConfigApplicationContext( HelloWordConfiguration.class );

    // 2: Configure the things that we want Spring to manage
    // HelloWorldConfiguration - @Configuration
    // name - @Beam

    // 3: Retrieving Beans managed by Spring
    System.out.println( context.getBean( "name" ) );
    System.out.println( context.getBean( "age" ) );

    System.out.println( context.getBean( "person" ) );
    System.out.println( context.getBean( "person2MethodCall" ) );
    System.out.println( context.getBean( "person3Parameters" ) );

    System.out.println( context.getBean( "address2" ) );

    System.out.println( context.getBean( Person.class ) );

    // class 로 받아오기 -> 현재는 에러가 발생하여 일단 주석 처리
    System.out.println( context.getBean( Address.class ) );

    // 일치하는 bean 처리하기
    // @Primary 와 @Qualifier로 사용하면 된다.
    System.out.println( context.getBean( "person5Qualifier" ) );

    // 사용하는 bean 확인하기
    Arrays.stream( context.getBeanDefinitionNames() )
        .forEach( System.out::println );


  }
}
