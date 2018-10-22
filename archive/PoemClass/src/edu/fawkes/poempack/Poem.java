/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.poempack;

/**
 *
 * @author igor
 */
public class Poem {
   private String name;
   private int numOfLines;

    public Poem(String name, int numOfLines) {
        this.name = name;
        this.numOfLines = numOfLines;
    }

    public String getName() {
        return name;
    }

    public int getNumOfLines() {
        return numOfLines;
    }
   
}
