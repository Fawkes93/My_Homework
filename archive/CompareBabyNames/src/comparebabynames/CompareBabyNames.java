package comparebabynames;

/**
 *
 * @author igor
 */
public class CompareBabyNames {

    public static String combineName(String name1, String name2, String name3) {
        String combo1 = name1.concat(name2);
        String combo2 = name1.concat(name3);
        String combo3 = name2.concat(name1);
        String combo4 = name2.concat(name3);
        String combo5 = name3.concat(name1);
        String combo6 = name3.concat(name2);
        
        String concatName = combo1 + " " +combo2;
        String concatName2 = combo3 + " " +combo4;
        String concatName3 = combo5 + " " +combo6;

        return concatName + " " + concatName2 +  " " + concatName3;
    }

    public static void main(String[] args) {
        System.out.println(combineName("Daniel", "Andy", "Floid"));
    }

}
