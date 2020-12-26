package chapter05;

import static Print.ShortPrint.print;

public class Flower {
    int petalsCount = 0;
    String s = "Initial value";
    Flower(int petals){
        petalsCount = petals;
        print("Constructor with int parameter petalsCount: " + petalsCount);
    }
    Flower(String ss){
        s = ss;
        print("Constructor with String parameter ss: " + ss);
    }
    Flower(String s, int petals){
        this(petals);
        //this(s); // this won't work as only one constructor could be called from constructor
        this.s = s;
        print("Both arguments - string and int");
    }
    Flower(){
        this("Hi", 47);
        print("Default constructor without any arguments");
    }
    void printPeralsCount(){
        //this(11); won't work as it's allowed in constructors only
        print("Petals count: " + petalsCount + " s: " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPeralsCount();
    }
}
