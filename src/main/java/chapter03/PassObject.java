package chapter03;

import static Print.ShortPrint.print;

class Letter {
    char c;
}
public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("x.c= " + x.c);
        f(x);
        print("x.c= " + x.c);
    }
}
