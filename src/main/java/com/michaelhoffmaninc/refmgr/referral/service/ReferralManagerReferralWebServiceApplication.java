package com.michaelhoffmaninc.refmgr.referral.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.stereotype.Component;

/**
 * Application initialization for the referral service.
 * 
 * @author Michael Hoffman
 *
 */
@SpringBootApplication
public class ReferralManagerReferralWebServiceApplication {

   public static void main(String[] args) {
      SpringApplication.run(ReferralManagerReferralWebServiceApplication.class, args);
   }

   @Component
   public static class CustomizedRestMvcConfiguration
         extends RepositoryRestConfigurerAdapter {

      @Override
      public void configureRepositoryRestConfiguration(
            RepositoryRestConfiguration config) {
         config.setBasePath("/api");
      }

   }

}
