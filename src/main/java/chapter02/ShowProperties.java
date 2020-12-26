package chapter02;
/** Shows system properties by the means of System package
 *
 * @author cheshi.mantu@pm.me
 */
public class ShowProperties {
/**
 * @param args list of the parameters from CLI
 * */
    public static void main(String args[]){
        System.getProperties().list(System.out);
        System.out.println("Current user name: "+ System.getProperty("user.name"));
    }
}
