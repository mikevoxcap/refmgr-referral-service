package com.michaelhoffmaninc.refmgr.referral.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * API for calls to the referral web service.
 * 
 * @author Michael Hoffman
 *
 */
@RestController("/referrals")
public class ReferralApi {

   /**
    * Returns all referrals
    */
   @RequestMapping(method = RequestMethod.GET)
   public void get() {

   }
}
