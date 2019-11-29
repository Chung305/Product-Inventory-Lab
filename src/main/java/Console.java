

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
    public static Integer showMenu(){
        return getInt("Do something\n" +
                "1 - Create products\n" +
                "2 - Look Through Product\n" +
                "3 - Update Product\n" +
                "4 - Delete Product\n" +
                "5 - Product report\n" +
                "6 - Exit");

    }

     public static Integer getInt(String input){
        Scanner scanner = new Scanner(System.in);
        System.out.println(input);
        return scanner.nextInt();
     }

}
