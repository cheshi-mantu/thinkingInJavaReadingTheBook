package chapter09;


import static Print.ShortPrint.print;

public class Apply {
    public static void process(Processor p, Object s){
        print("We're using a processor " + p.name());
        print ((String) p.process(s));
    }

}