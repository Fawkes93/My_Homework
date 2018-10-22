package com.fawkes.talkalot;

public class OutgoingPhoneCall extends PhoneCall {

    double minutes;

    public OutgoingPhoneCall(String phoneNumber, double minutes) {
        super(phoneNumber);
        super.setCallPrice(0.02);
        this.minutes = minutes;
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
        return this.getPhoneNumber() + " you spoke " + minutes + " minutes."
                + " Your call costed " + (this.callPrice * minutes) + "$" + " at the rate of "
                + this.getCallPrice() + " per second";
    }

    @Override
    public String toString() {
        return this.getCallInfo();
    }

}
