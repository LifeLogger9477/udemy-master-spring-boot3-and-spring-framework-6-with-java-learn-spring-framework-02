package com.in28minutes.learnspringframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */

@Component
class SomeClass {

  private SomeDependency someDependency;

  public SomeClass(SomeDependency someDependency) {

    super();
    this.someDependency = someDependency;
    System.out.println("All dependencies are ready!");
  }

  @PostConstruct
  public void initialize() {

    someDependency.getReady();
  }

  // 이 부분이 동작하지 않는다. 음....
  @PreDestroy
  public void cleanup() {

    System.out.println("Cleanup");
  }
}

@Component
class SomeDependency {

  public void getReady() {

    System.out.println("Some logic using SomeDependency");
  }
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

  public static void main(String[] args) {

    var context =
        new AnnotationConfigApplicationContext(
            PrePostAnnotationsContextLauncherApplication.class
        );

    Arrays.stream( context.getBeanDefinitionNames() )
        .forEach( System.out::println );
  }
}
