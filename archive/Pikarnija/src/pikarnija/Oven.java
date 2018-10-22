/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikarnija;

/**
 *
 * @author igor
 */
public class Oven {
    
    public void bake(Biscuit[] biscuits){
        preheat (Biscuit.howManyDegrees)
    }
    
    public void preheat(int degrees){
        System.out.println("Oven is preheated up to " + degrees + "");
    }
    
    public void startBaking(){
        System.out.println("Baking biscuit");
        
    }
    
}
