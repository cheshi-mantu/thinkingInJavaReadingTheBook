package chapter07;

import static Print.ShortPrint.print;

public class Orc extends Villain {
    private int orcNumber;
    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    public void change(String name, int orcNumber){
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString(){
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        print(orc.toString());
        orc.change("Bob", 19);
        print(orc.toString());
    }
}
