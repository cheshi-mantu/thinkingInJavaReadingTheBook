package chapter09;

import java.util.Arrays;

import static Print.ShortPrint.print;

class Processor {
    public String name(){
        return getClass().getSimpleName();
    }
    Object process (Object input) {return input;}
}
class Upcase extends Processor{
    String process (Object input) {
        return ((String)input).toUpperCase();
    }
}
class Downcase extends Processor{
    String process (Object input) {
        return ((String)input).toLowerCase();
    }
}
class Splitter extends Processor {
    String process (Object input) {
        return Arrays.toString(((String)input).split(" "));
    }

}
public class Apply {
    public static void process(Processor p, Object s){
        print("We're using a processor " + p.name());
        print ((String) p.process(s));
    }
    public static String s = "Disageement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}