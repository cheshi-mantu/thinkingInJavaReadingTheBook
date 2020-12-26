package chapter04;

import static chapter03.ShortPrint.print;

public class IfElseExample {
    static int result = 0;
    static void test (int testVal, int target){
        if (testVal > target)
            result = +1;
        else if (testVal < target)
            result = -1;
        else
            result = 0;
    }
    public static void main(String[] args) {
        test(10,5);
        print("" + result);
        test(5,10);
        print("" + result);
        test(5,5);
        print("" + result);
    }
}
