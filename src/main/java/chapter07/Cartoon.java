package chapter07;

import static Print.ShortPrint.print;

public class Cartoon extends Drawing{
    public Cartoon () {
        print("Cartoon's constructor, the descendant of Drawing()");
    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }


}
