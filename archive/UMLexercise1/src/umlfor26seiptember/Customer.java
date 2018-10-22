
package umlfor26seiptember;

public class Customer {
   private int ID, discount;
   private String name;
   private char gender;

    public Customer(int ID, char gender, String name) {
        this.ID = ID;
        this.gender = gender;
        this.name = name;
    }
    

    public int getID() {
        return ID;
    }

    public int getDiscount() {
        return discount;
    }

    public String getName() {
        return name;
    }
    
    public char getGener(){
        return gender;
    }
    
    public void setGender (char gender){
        this.gender = gender;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
   
   @Override
   public String toString(){
       return name + '(' + ID + ')';
   }
}
