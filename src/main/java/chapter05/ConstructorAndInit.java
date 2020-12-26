package chapter05;

import static Print.ShortPrint.print;

/** Constructor and constructor overloading example
 *
 */
class Rock {
    String str;
    Rock() { // Constructor method
        print("Rock created with no name");
        }
    Rock(String strInit) { // Constructor method- overload
        print("Rock created with the name " + strInit);
        }
}
public class ConstructorAndInit {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            new Rock();
            new Rock("" + i);
        }
    }

}
