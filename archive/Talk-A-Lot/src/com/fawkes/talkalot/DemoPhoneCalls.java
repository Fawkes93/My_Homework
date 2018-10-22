/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fawkes.talkalot;

import java.util.ArrayList;


public class DemoPhoneCalls {

    public static void main(String[] args) {
        PhoneCall test = new OutgoingPhoneCall("+37369177786", 10.5);
        System.out.println(test);
        ArrayList<PhoneCall>  callList = new ArrayList<>();
        callList.add(new IncomingPhoneCall("244656"));
        callList.add(new OutgoingPhoneCall("025143427", 17));
        callList.add(new IncomingPhoneCall("0000000"));
        callList.add(new OutgoingPhoneCall("123456789", 55));
        callList.add(new IncomingPhoneCall("11112222"));
        callList.add(new OutgoingPhoneCall("025143427", 11));
        callList.add(new IncomingPhoneCall("244656"));
        callList.add(new OutgoingPhoneCall("+373 691 28287", 02));
        callList.add(new IncomingPhoneCall("244656"));
        callList.add(new OutgoingPhoneCall("069177786", 04.5));
        for(PhoneCall element:callList){
            System.out.println(element);
        }
    }
    
}
