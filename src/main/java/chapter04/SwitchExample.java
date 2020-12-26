package chapter04;

import java.util.Random;

import static Print.ShortPrint.print;
import static Print.ShortPrint.printb;

public class SwitchExample {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++){
            int c = rand.nextInt(26) + 'a';
            printb("" + (char)c + " ");
            switch(c) {
                case 'a':
                case 'i':
                case 'e':
                case 'o':
                case 'u': print("vowel");
                break; //
                case 'y':
                case 'w': print(" conditionally vowel");
                break;
                default: print("consonant");

            }
        }
    }
}
