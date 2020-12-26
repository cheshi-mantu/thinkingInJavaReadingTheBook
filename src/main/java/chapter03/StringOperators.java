package chapter03;

import static chapter03.ShortPrint.print;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        print(s + x + y + z); // will convert all to string
        print(x + " " + s);// will convert x to string
        s += "(summed) = "; // concatenate
        print(s + (x+y+z));// first will calculate (x+y+z) and only after that will convert to string
        print("" + x); // same as Integer.toString();
    }


}
