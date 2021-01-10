package chapter09;

import static Print.ShortPrint.print;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight(){print("AC: Fight");}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly { // extends should be on the 1st place
    // and then all the implementationa
    public void swim() {print("Hero: swim");}
    public void fly(){print("Hero: fly");}

}
public class Adventure {
    public static void t (CanFight x) {x.fight();}
    public static void u (CanSwim x) {x.swim();}
    public static void v (CanFly x) {x.fly();}
    public static void w (ActionCharacter x) {x.fight();}

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
