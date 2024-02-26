import java.util.Scanner;



public class App {

    
    public static void main(String[] args) throws Exception {

        Scanner input=new Scanner(System.in);
       

        System.out.println("\n----------------------------------");
        System.out.println("Welcome to Food Inventory System!");
        System.out.println("----------------------------------");
        System.out.println("\n Which one of the below are you?");
        System.out.println("\n 1. ADMIN");
        System.out.println(" 2. CUSTOMER\n");

        String userChoice= input.nextLine();

        if (userChoice.equals("1")||userChoice.equals("admin")||userChoice.equals("ADMIN")) {
            
          
        }
        else if (userChoice.equals("2")||userChoice.equals("customer")||userChoice.equals("CUSTOMER")) {
            
            
        }
        else{

            System.out.println("\nPlease choose a user from the above users xD hehe");
        }

        input.close();
    }
}
