package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */
@Component
public class PacmanGame implements GamingConsole {

  public void up() {

    System.out.println( "move up" );
  }

  public void down() {

    System.out.println( "move down" );
  }

  public void left() {

    System.out.println( "move left" );
  }

  public void right() {

    System.out.println( "move right" );
  }
}
