package com.in28minutes.learnspringframework.examples.h1;

import com.in28minutes.learnspringframework.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */

public class XmlConfigurationContextLauncherApplication {

  public static void main(String[] args) {

    var context =
        new ClassPathXmlApplicationContext("contextConfiguration.xml");

      Arrays.stream( context.getBeanDefinitionNames() )
          .forEach( System.out::println );

    System.out.println(context.getBean( "name" ));
    System.out.println(context.getBean( "age" ));

    context.getBean( GameRunner.class ).run();
  }
}
