package mainpack;

import java.util.Scanner;

public class MajorsEnumerated {

    public enum Majors {
        ACC("Business Division"),
        CHEM("Science Division"),
        CIS("Business Division"),
        ENG("Humanities Division"),
        HIS("Humanities Division"),
        PHYS("Science Division");

        private String division;

        private Majors(String str) {
            division = str;
        }
    }

    public void printMajors() {

        for (Majors i : Majors.values()) {
            System.out.println(i + "---");
        }
    }

    public void assignDivision() {
        System.out.println("Enter desired major: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toUpperCase();
        try {
            Majors major = Majors.valueOf(input);

            System.out.println(major + " is part of " + major.division);
        }
        catch(Exception a){
            System.out.println("that's not a major");
        }
    }

}
