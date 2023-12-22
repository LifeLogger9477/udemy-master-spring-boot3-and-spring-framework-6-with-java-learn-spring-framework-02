package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */
@Component
public class GameRunner {

  private GamingConsole game;

  public GameRunner(GamingConsole game) {

    this.game = game;
  }

  public void run() {

    System.out.println( "Running game: " + game );

    game.up();
    game.down();
    game.left();
    game.right();
  }
}