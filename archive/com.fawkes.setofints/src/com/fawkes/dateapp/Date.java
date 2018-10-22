/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fawkes.dateapp;

/**
 *
 * @author igor
 */
public class Date {

    int MM, DD, DDD, YYYY;
    String month;
    String space;
    String separator;

    public Date(int MM, int DD, int YYYY) {
        this.MM = MM;
        this.DD = DD;
        this.YYYY = YYYY;

    }

    public Date(String month, int DD, int YYYY) {
        this.DD = DD;
        this.YYYY = YYYY;
        this.month = month;
    }

    public Date(int DDD, int YYYY) {
        this.DDD = DDD;
        this.YYYY = YYYY;
    }

    public static void main(String[] args) {
        Date date1 = new Date(03, 14, 2018);
        System.out.println(date1.MM + "/" + date1.DD + "/" + date1.YYYY);
        Date date2 = new Date("June", 14, 2018);
        System.out.println(date2.month + " " + date1.DD + ", " + date1.YYYY);
        Date date3 = new Date(123, 1970);
        System.out.println(date3.DDD + " " + date3.YYYY);

    }
}
