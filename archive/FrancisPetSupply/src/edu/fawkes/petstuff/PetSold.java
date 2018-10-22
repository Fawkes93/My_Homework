/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.petstuff;

/**
 *
 * @author igor
 */
public class PetSold extends ItemSold {

    private boolean isVaccined, isNeutered, isHousebroken;

    public PetSold() {
        super("");
    }

    public PetSold(boolean isVaccined, boolean isNeutered, boolean isHousebroken) {
        super("");
        this.isVaccined = isVaccined;
        this.isNeutered = isNeutered;
        this.isHousebroken = isHousebroken;
    }

    public boolean isIsVaccined() {
        return isVaccined;
    }

    public void setIsVaccined(boolean isVaccined) {
        this.isVaccined = isVaccined;
    }

    public boolean isIsNeutered() {
        return isNeutered;
    }

    public void setIsNeutered(boolean isNeutered) {
        this.isNeutered = isNeutered;
    }

    public boolean isIsHousebroken() {
        return isHousebroken;
    }

    public void setIsHousebroken(boolean isHousebroken) {
        this.isHousebroken = isHousebroken;
    }

    @Override
    public String toString() {
        return "PetSold{" + "isVaccined=" + isVaccined + ", isNeutered=" + isNeutered + ", isHousebroken=" + isHousebroken + '}';
    }

}
