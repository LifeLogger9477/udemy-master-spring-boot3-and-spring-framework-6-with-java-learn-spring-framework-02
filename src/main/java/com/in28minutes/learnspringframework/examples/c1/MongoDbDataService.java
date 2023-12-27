package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * author : ms.Lee
 * date   : 2023-12-27
 */
@Component
@Primary
public class MongoDbDataService implements DataService {

  @Override
  public int[] retrieveData() {

    return new int[] {11, 22, 33, 44, 55};
  }
}
