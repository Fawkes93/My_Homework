package com.fawkes.integerset;

public class IntegerSet {

    boolean[] a = new boolean[100];

    public IntegerSet() {

    }

    public boolean getSetByIndex(int n) {
        return a[n];
    }

    public boolean[] getIntegerSet() {
        return this.a;
    }

    public static IntegerSet union(IntegerSet firstSet, IntegerSet secondSet) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.getIntegerSet().length; i++) {
            result.a[i] = firstSet.a[i] || secondSet.a[i];
        }
        return result;
    }

    public static IntegerSet intersection(IntegerSet firstSet, IntegerSet secondSet) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.getIntegerSet().length; i++) {
            result.a[i] = firstSet.a[i] || secondSet.a[i];
        }
        return result;
    }

    public void insertElement(int elementIndex) {

        if (elementIndex < this.a.length || elementIndex >= 0) {
        }
        this.a[elementIndex - 1] = true;
    }

    public void deleteElement(int elementIndex) {
        if (elementIndex < this.a.length || elementIndex >= 0) {
            this.a[elementIndex - 1] = false;
        }
    }

    @Override
    public String toString() {
        String result = "Integer{";
        for (int i = 0; i < this.a.length; i++) {
            if (this.a[i]) {
                result = result + i + " ";
            }
        }

        result += "}";
        return result;
    }

    public static void main(String[] args) {
        IntegerSet test1 = new IntegerSet();
        test1.insertElement(5);
        IntegerSet test2 = new IntegerSet();
        test2.insertElement(10);
        System.out.println(test1.getSetByIndex(5));
        IntegerSet.union(test1, test2);
        System.out.println(IntegerSet.union(test1, test2));
        System.out.println(test1.getIntegerSet().length);

    }
}
//