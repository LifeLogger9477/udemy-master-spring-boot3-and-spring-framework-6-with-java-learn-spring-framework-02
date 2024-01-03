package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * author : ms.Lee
 * date   : 2023-12-27
 */
//@Component
@Repository
public class MySqlDataService implements DataService {

  @Override
  public int[] retrieveData() {

    return new int[] {1, 2, 3, 4, 5};
  }
}
