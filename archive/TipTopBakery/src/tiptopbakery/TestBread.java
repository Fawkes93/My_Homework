package tiptopbakery;

public class TestBread {

    public static void main(String[] args) {
        Bread a = new Bread("rye", 120);
        Bread b = new Bread("wheat", 230);
        Bread c = new Bread("corn", 50);

        System.out.println("Bread made of " + a.getBreadType()
                + " containing calories - " + a.getCaloriesPerSlice() + " with love from " + Bread.MOTTO);
        System.out.println("Bread made of " + b.getBreadType()
                + " containing calories - " + b.getCaloriesPerSlice() + " with love from " + Bread.MOTTO);
        System.out.println("Bread made of " + c.getBreadType()
                + " containing calories - " + c.getCaloriesPerSlice() + " with love from " + Bread.MOTTO);
    }

}
