package chapter04;

import java.util.Random;

import static chapter03.ShortPrint.print;

public class ForEachExample {
    public static void main(String[] args) {
        Random rand = new Random(47);
        float f[] = new float [10];
        for (int i = 0; i < 10; i++)
            f[i] = rand.nextFloat();
        for (float x : f) // <<< this is foreach,
            print(""+x);
    }
}
