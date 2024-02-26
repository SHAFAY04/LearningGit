import java.util.Scanner;

class Customer{

    String name;
    String pass;

    Customer(String name, String pass){

        this.name=name;
        this.pass=pass;
    }


    
}

class FoodItem{

    String category;
    String itemId;
    String itemName;
    String itemPrice;
    String itemQuantity;
    FoodItem left, right;
    private FoodItem root;
    

    FoodItem(String category,String itemId,String itemName,String itemPrice,String itemQuantity){

        this.category=category;
        this.itemId=itemId;
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.itemQuantity=itemQuantity;
        this.left = this.right = null;
        
    }

    public void add(FoodItem newFoodItem) {
        if (root == null) {
            root = newFoodItem;
        } else {
            add(root, newFoodItem);
        }
    }
    
    private void add(FoodItem currentNode, FoodItem newFoodItem) {
        if (newFoodItem.category.compareToIgnoreCase(currentNode.category) < 0) {
            if (currentNode.left == null) {
                currentNode.left = newFoodItem;
            } else {
                add(currentNode.left, newFoodItem);
            }
        } else {
            if (currentNode.right == null) {
                currentNode.right = newFoodItem;
            } else {
                add(currentNode.right, newFoodItem);
            }
        }
    }


}


public class App {

    static void admin(FoodItem foodItemTree){

        Scanner input=new Scanner(System.in);

        String category;
        String Id;
        String Name;
        String Price;
        String Quantity;

        System.out.println("\n------------------------------");
        System.out.println("You are logged in as Admin!");
        System.out.println("--------------------------------");

        System.out.println("\nYOU CAN NOW ADD THE FOLLOWING ITEMS TO THE INVENTORY ^_^");
        System.out.println("\n 1. beverages");
        System.out.println(" 2. confectioneries\n");
        
        String categoryChoice= input.nextLine();

        if (categoryChoice.equals("2")||categoryChoice.equals("confectioneries")||categoryChoice.equals("CONFECTIONERIES")) {
            
            System.out.println("\nEnter ID of the confectionary: ");
            Id=input.nextLine();
            System.out.println("\nEnter Name of the confectionary: ");
            Name=input.nextLine();
            System.out.println("\nEnter Price of the confectionary: ");
            Price=input.nextLine();
            System.out.println("\nEnter Quantity of the confectionary: ");
            Quantity=input.nextLine();

            FoodItem newFoodItem = new FoodItem("confectionary", Id, Name, Price, Quantity);
            foodItemTree.add(newFoodItem);

            
        }
        else if (categoryChoice.equals("1")||categoryChoice.equals("beverages")||categoryChoice.equals("BEVERAGES")) {
            
            System.out.println("\nEnter ID of the beverage: ");
            Id=input.nextLine();
            System.out.println("\nEnter Name of the beverage: ");
            Name=input.nextLine();
            System.out.println("\nEnter Price of the beverage: ");
            Price=input.nextLine();
            System.out.println("\nEnter Quantity of the beverage: ");
            Quantity=input.nextLine();
            
            FoodItem newFoodItem = new FoodItem("beverage", Id, Name, Price, Quantity);
            foodItemTree.add(newFoodItem);


        }
        else{

            System.out.println("\n Please choose item from the available items!");
            admin(foodItemTree);
        }


            input.close();
    }

    static void customer(FoodItem foodItemTree) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("\n------------------------------");
        System.out.println("WELCOME TO CUSTOMER PORTAL!");
        System.out.println("--------------------------------");
    
        System.out.println("\nEnter the food item ID to search and buy: ");
        String itemId = input.nextLine();
    
    
       
    }
    
    

    public static void main(String[] args) throws Exception {

        Scanner input=new Scanner(System.in);
        FoodItem foodItemTree = new FoodItem("", "", "", "", "");

        System.out.println("\n----------------------------------");
        System.out.println("Welcome to Food Inventory System!");
        System.out.println("----------------------------------");
        System.out.println("\n Which one of the below are you?");
        System.out.println("\n 1. ADMIN");
        System.out.println(" 2. CUSTOMER\n");

        String userChoice= input.nextLine();

        if (userChoice.equals("1")||userChoice.equals("admin")||userChoice.equals("ADMIN")) {
            
            admin(foodItemTree);
        }
        else if (userChoice.equals("2")||userChoice.equals("customer")||userChoice.equals("CUSTOMER")) {
            
            
        }
        else{

            System.out.println("\nPlease choose a user from the above users!");
        }

        input.close();
    }
}
