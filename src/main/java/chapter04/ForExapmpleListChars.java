package chapter04;

import static Print.ShortPrint.print;

public class ForExapmpleListChars {
    public static void main(String[] args) {
        for(char c = 0; c < 128; c++)
            if(Character.isLowerCase(c))
                print("Val: " + (int)c + " symbol: " + c);
    for (int i = 0; i <=100; i++)
        print(""+i);
    }

}
