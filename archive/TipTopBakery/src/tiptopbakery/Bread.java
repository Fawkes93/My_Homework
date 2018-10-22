package tiptopbakery;

class Bread {

    String breadType;
    int caloriesPerSlice;
    public static final String MOTTO = "The staff of life";

    Bread(String parameter1, int parameter2) {

       breadType = parameter1;
       caloriesPerSlice = parameter2;

    }

    public String getBreadType() {
        return breadType;
    }

    public int getCaloriesPerSlice() {
        return caloriesPerSlice;
    }

}
//Create a class for the Tip Top Bakery named Bread with data fields for bread type
//(such as “rye”) and calories per slice. Include a constructor that takes parameters
//for each field, and include get methods that return the values of the fields. Also
//include a public final static String named MOTTO and initialize it to The staff of
//life.Write an application named TestBread to instantiate three Bread objects with
//different values, and then display all the data, including the motto, for each object.
//Save both the Bread.java and TestBread.java files. (edited)
