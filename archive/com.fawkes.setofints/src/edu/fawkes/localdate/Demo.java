/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.localdate;

import com.fawkes.integerset.IntegerSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;


public class Demo {
    
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();  // no new keyword because final??      
        LocalDateTime ldt  = LocalDateTime.now();
        System.out.println(ld);
        System.out.println("");
        System.out.println(ldt);
        LocalDate date2 = LocalDate.parse("2015-02-02");
        System.out.println(date2);
        System.out.println(ldt.getDayOfMonth());
        LocalDate firstSex = LocalDate.of(1993, Month.MARCH, 16);
        System.out.println(firstSex.withMonth(7));
        System.out.println(firstSex.atTime(LocalTime.of(16, 13)));
        
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(3);
        
        IntegerSet s = new IntegerSet();
        s.insertElement(2);
        System.out.println(set);
        
        
    }
}
