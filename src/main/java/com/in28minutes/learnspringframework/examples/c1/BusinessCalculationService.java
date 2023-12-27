package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * author : ms.Lee
 * date   : 2023-12-27
 */
@Component
public class BusinessCalculationService {

  private DataService dataService;

  public BusinessCalculationService(DataService dataService) {

    this.dataService = dataService;
  }

  public int findMax() {

    return Arrays.stream( dataService.retrieveData() )
        .max()
        .orElse(0);
  }
}
