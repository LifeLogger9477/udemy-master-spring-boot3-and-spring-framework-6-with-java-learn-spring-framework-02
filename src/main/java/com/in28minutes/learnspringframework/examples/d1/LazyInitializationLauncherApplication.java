package com.in28minutes.learnspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {

  private ClassA classA;

  public ClassB(ClassA classA) {

    // logic
    System.out.println("Some Initialization logic");
    this.classA = classA;
  }

  public void doSomething() {

    System.out.println("Do Something.");
  }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

  public static void main(String[] args) {

    var context =
        new AnnotationConfigApplicationContext(
            LazyInitializationLauncherApplication.class
        );

    // @Lazy 를 사용하는 경우에는
    // 해당 bean을 사용할 때 초기화되고 수행된다.
    // 사용하지 않으면 실행할 때 시작한다. (즉시 초기화 : Eager)
    System.out.println("Initialization of context is completed.");
    context.getBean( ClassB.class ).doSomething();
  }
}
