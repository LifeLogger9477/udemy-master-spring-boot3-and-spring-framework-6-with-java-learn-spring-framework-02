package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */
public class App03GamingSpringBeans {

  public static void main(String[] args) {

    var context =
        new AnnotationConfigApplicationContext( GamingConfiguration.class );

    context.getBean( GamingConsole.class ).up();

    context.getBean( GameRunner.class ).run();
  }
}
