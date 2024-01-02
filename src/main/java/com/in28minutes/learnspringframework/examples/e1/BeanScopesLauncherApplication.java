package com.in28minutes.learnspringframework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * author : ms.Lee
 * date   : 2023-12-21
 */

@Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {

  public static void main(String[] args) {

    var context =
        new AnnotationConfigApplicationContext(
            BeanScopesLauncherApplication.class
        );

    System.out.println(context.getBean( NormalClass.class ));
    System.out.println(context.getBean( NormalClass.class ));
    // NormalClass : hashcode 동일 (동일한 인스턴스)
    // com.in28minutes.learnspringframework.examples.e1.NormalClass@3c73951
    // com.in28minutes.learnspringframework.examples.e1.NormalClass@3c73951

    System.out.println(context.getBean( PrototypeClass.class ));
    System.out.println(context.getBean( PrototypeClass.class ));
    System.out.println(context.getBean( PrototypeClass.class ));
    // 호출할 때마다 새로운 bean 획득
    // com.in28minutes.learnspringframework.examples.e1.PrototypeClass@3d5c822d
    // com.in28minutes.learnspringframework.examples.e1.PrototypeClass@6f46426d
    // com.in28minutes.learnspringframework.examples.e1.PrototypeClass@73700b80
  }
}
