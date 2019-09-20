/**
 * @author Sumit Aggarwal; 000793607
 * This class creates a Coffee
 */

import java.util.Scanner;

public class Coffee extends TimsProduct implements Consumable {
    /** descri[tion of the coffee*/
    private String description;
    /** calories in the coffee*/
    private int calorieCount;


    private Coffee( String name, double cost, double price, String desc, int calories){
        super(name, cost,price);
        description = desc;
        calorieCount = calories;
    }

    /** get the user information about their coffee*/
    public static Coffee create(){
        /** calories in the coffee*/
        int calories = 0;
        /** name of the coffee*/
        String name = "";
        /**description of the coffee*/
        String description ="";
        /** production cost of the coffee*/
        double cost = 1.45;
        /** retail price of the coffee*/
        double price = 4.25;
        /** returns true if the user has ordered the coffee, false otherwise*/
        boolean ordered = true;
        Scanner input = new Scanner(System.in);
        /** runs until the user enters the correct value*/
        while(ordered){
            System.out.println("Enter roast type: " +
                    "1.Regular" +
                    " 2.Dark Roast ");

            int coffee_choice = input.nextInt();

            if(coffee_choice==1 || coffee_choice==2){
                switch(coffee_choice){
                    case 1:
                        name = "Regular";
                        description = "Freshly brewed high quality coffee";
                        calories = 10;
                        ordered = false;
                        break;
                    case 2:
                        name = "Dark Roast";
                        description ="Probably the best dark roast you'll ever taste";
                        calories = 20;
                        ordered = false;
                        break;
                }
                }
            else{
                System.out.println("Invalid input. Please select from the options given to you.");
                System.out.print("Enter roast type: [1.Regular, 2.Dark Roast]: ");
                coffee_choice = input.nextInt();
            }
        }

        Coffee coffee = new Coffee(name,cost,price,description,calories);
        return coffee;
    }

    /** returns the description of the coffee*/
    public String getDescription(){
        return description;
    }

    /** returns the calories in the coffee*/
    public int getCalorieCount(){
        return calorieCount;
    }

    /** returns the consumption method of coffee*/
    public String getConsumptionMethod(){
        return "Drinkable";
    }

    @Override
    public String toString(){
        return "Coffee \t : [" + getName() + ", $"+ super.getProductionCost()+", $"+super.getRetailPrice()+"]\t"+
                "["+ getDescription()+", "+getConsumptionMethod()+", calories = "+getCalorieCount() +"]";
    }
}
