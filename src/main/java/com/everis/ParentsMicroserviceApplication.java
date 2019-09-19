package com.everis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

/**
 * ParentsMicroserviceApplication class.
 * @author jeffrey
 * @version v1.0
 */
@SpringBootApplication
@EnableSwagger2WebFlux
public class ParentsMicroserviceApplication {
  /**
   * main method.
   * @param args arguments.
   */
  public static void main(final String[] args) {
    SpringApplication.run(ParentsMicroserviceApplication.class, args);
  }
}
