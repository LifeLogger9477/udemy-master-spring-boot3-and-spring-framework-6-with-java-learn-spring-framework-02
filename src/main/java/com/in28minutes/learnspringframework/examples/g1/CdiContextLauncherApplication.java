package com.in28minutes.learnspringframework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */

// @Component와 @Autowired 를 대신해서 @Named 와 @Inject 사용 가능
// 중요하지는 않지만 알아두는 것 필요

//@Component
@Named
class BusinessService {

  private DataService dataService;

  public DataService getDataService() {

    return dataService;
  }

  //@Autowired
  @Inject
  public void setDataService(DataService dataService) {

    System.out.println("Setter Injection");
    this.dataService = dataService;
  }
}

//@Component
@Named
class DataService {

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {

  public static void main(String[] args) {

    var context =
        new AnnotationConfigApplicationContext(
            CdiContextLauncherApplication.class
        );

      Arrays.stream( context.getBeanDefinitionNames() )
          .forEach( System.out::println );

    System.out.println(
        context.getBean( BusinessService.class )
            .getDataService()
    );
  }
}
