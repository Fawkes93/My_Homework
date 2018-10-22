/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fawkes.talkalot;

/**
 *
 * @author igor
 */
public abstract class PhoneCall {
    String phoneNumber;
    double callPrice;
    //int minutes;

    public PhoneCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.callPrice = 0.0f;
    }
    
    public PhoneCall(String phoneNumber, int minutes) {
        this.phoneNumber = phoneNumber;
        this.callPrice = 0.0f;
    //    this.minutes = minutes;
    }

    public void setCallPrice(double callPrice) {
        this.callPrice = callPrice;
    }

    public abstract String getPhoneNumber();

    public abstract double getCallPrice();
    
    public abstract String getCallInfo();
   
}
