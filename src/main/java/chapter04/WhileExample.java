package chapter04;

import static Print.ShortPrint.print;

public class WhileExample {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        print("" + result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while(condition())
            print("Still inside while... ");
        print("Exited while loop");
    }
}
// do ... while will run at least once as the check is being performed at the end
