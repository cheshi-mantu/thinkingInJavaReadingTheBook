package chapter03;

import static chapter03.ShortPrint.print;

class Tank {
    int level;
}
public class AssignmentExample {
    public static void main(String[] args) {
    Tank t1 = new Tank();
    Tank t2 = new Tank();
    t1.level = 9;
    t2.level = 47;
    print("t1.level: " + t1.level + ", t2.level: " + t2.level);
    t1 = t2;
    print("After asssignment t1 = t2");
    print("t1.level: " + t1.level + ", t2.level: " + t2.level);
    t1.level = 27;
    print("After asssignment t1.level = 27");
    print("t1.level: " + t1.level + ", t2.level: " + t2.level);
    print("Now, avoiding the aliasing...");
    Tank t3 = new Tank();
    Tank t4 = new Tank();
    t3.level = 2;
    t4.level = 4;
    print("t3.level: " + t3.level + ", t4.level: " + t4.level);
    t3.level = t4.level;
    print("After asssignment t3.level = t4.level");
    print("t3.level: " + t3.level + ", t4.level: " + t4.level);
    t3.level = 100;
    print("After asssignment t3.level = 100");
    print("t3.level: " + t3.level + ", t4.level: " + t4.level);


    }
}
