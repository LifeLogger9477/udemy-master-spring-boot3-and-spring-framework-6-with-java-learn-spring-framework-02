package com.in28minutes.learnspringframework.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */

@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {

  public static void main(String[] args) {

    var context =
        new AnnotationConfigApplicationContext(
            SimpleSpringContextLauncherApplication.class
        );

      Arrays.stream( context.getBeanDefinitionNames() )
          .forEach( System.out::println );
  }
}
