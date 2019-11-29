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

                break;
            case 2 :

                break;
            case 3 :

                break;
            case 4 :

                break;
            case 5 :

                break;
            case 6 :

                break;
            default :
                System.out.println("try again!");
                break;
        }
    }
}
