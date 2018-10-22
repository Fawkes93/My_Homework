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
public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        this.callPrice =0.02;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public double getCallPrice() {
        return this.callPrice;
    }

    @Override
    public String getCallInfo() {
        return this.getPhoneNumber()+" Your call costed " + this.callPrice  + "$"+" at the rate of "
                + this.getCallPrice() + " per second";
    }

    @Override
    public String toString() {
        return this.getCallInfo();
    }

}
