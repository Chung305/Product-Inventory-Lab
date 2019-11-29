

import java.util.Scanner;

public class Console {

    public static void printWelcome(){
        System.out.println("" +
                "**************************************************\n" +
                "***           Welcome and Bienvenue            ***\n" +
                "***                    to                      ***\n" +
                "***          ZipCo Inventory Manager           ***\n" +
                "**************************************************");
    }
     public static String getString(String input){
        Scanner scanner = new Scanner(System.in);
        System.out.println(input);
        return scanner.next();
     }
}
