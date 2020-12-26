package chapter02;

import java.util.Date;
/** The very first standard example in any programming language */
public class HelloDate {
    /** Main method: shows the greeting and the current date
     * @param args list of the parameters from CLI
     * */

    public static void main (String args[]){
        System.out.println("Hi there, today is...");
        System.out.println(new Date());

    }
}
