package chapter02;

public class StorageExample {
    static final String checkThisString = "Two words";
    public static void main(String args[]){

        System.out.println("Storage needed for the string: " + checkThisString);
        System.out.println(storageNeeded(checkThisString));
    }
    private static int storageNeeded(String stringToCheck){
        return stringToCheck.length() * 2;
    }
}
