import models.Sneakers;
import services.SneakerService;

public class MainApp {
    private SneakerService sneakerService = new SneakerService();
    public static void main(String[] arr){
        MainApp main = new MainApp();
        main.init();
    }
    public void init(){
        Console.printWelcome();
        menu(Console.showMenu());
    }

    public void menu(Integer choice){
        switch(choice){
            case 1 :
                sneakerService.create(
                        Console.getString("Name :"),
                        Console.getString("Brand :"),
                        Console.getString("Sport :"),
                        Console.getDouble("Size :"),
                        Console.getInt("Quantity :"),
                        Console.getDouble("Price :"));
                menu(Console.showMenu());
                break;
            case 2 :
                for(Sneakers each : sneakerService.findAll()){
                    System.out.println(each.toString());
                }
                menu(Console.showMenu());
                break;
            case 3 :

                break;
            case 4 :

                break;
            case 5 :

                break;
            case 6 :
                System.exit(0);
                break;
            default :
                System.out.println("try again!");
                break;
        }
    }
}
