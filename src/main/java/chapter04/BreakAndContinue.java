package chapter04;

import static chapter03.ShortPrint.print;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i%9 == 0) continue; // will omit 9, 27, 36 etc
            if (i == 97) break; // loop will never print anything more than 96
            print(""+i);
        }
    }
}
