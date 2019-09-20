/**
 * @author Sumit Aggarwal; 000793607
 * This class creates Donut which is a part of the Tims Product
 */

import java.util.Scanner;

public class Donut extends TimsProduct implements Consumable{
    /** description of the donut*/
    private String description;
    /** calories in a donut*/
    private int calorieCount;

    private Donut(String name, String desc, double cost, double price, int calories){
        super(name,cost,price);
        description = desc;
        calorieCount = calories;
    }

    /** get user information to create a Mug*/
    public static Donut create(){
        /** name of the donut*/
        String name = "";
        /** description of the donut*/
        String description = "";
        /** production cost of the donut*/
        double cost = 0.50;
        /** retail price of the donut*/
        double price = 1.50;
        /**  calories in the donut*/
        int calories = 0;
        /** returns true if user orders the donut, false otherwise*/
        boolean ordered = true;
        Scanner input = new Scanner(System.in);

        /** runs until the user enters the correct values*/
        while(ordered){
            System.out.println("Enter the type of donut you'll like to have:" +
                    "1. Chocolate Frosted Donut" +
                    "2. Cinnamon Twist Donut" +
                    "3. Cream-filled Donut" +
                    "4. Boston Kreme Pie Donut");

            int donut_choice = input.nextInt();
            if(donut_choice>=1 && donut_choice<=4){
                switch (donut_choice){
                    case 1:
                        name = "Chocolate Frosted Donut";
                        description = "Covered with chocolate layer and sprinkles, this doughnut is definitely for chocolate lovers, ";
                        calories = 250;
                        ordered = false;
                        break;
                    case 2:
                        name = "Cinnamon Twist Donut";
                        description = "This doughnut is shaped and twisted by hand, then covered with cinnamon sugar, ";
                        calories = 265;
                        ordered = false;
                        break;
                    case 3:
                        name = "Cream-filled Donut";
                        description = "These cream filled doughnuts are soft pillows with an easy cream filling." +
                                " The cream filling couldn't be easier. It's made with instant vanilla pudding. " +
                                "The yeast doughnuts are deep fried to perfection and then the filling is piped into them, ";
                        calories = 350;
                        ordered = false;
                        break;
                    case 4:
                        name = "Boston Kreme Pie Donut";
                        description = "Filled with vanilla custard and dipped in chocolate, these doughnuts would make Boston proud, ";
                        calories = 280;
                        ordered = false;
                        break;
                }
            }
            else{
                System.out.println("Invalid input. Please select from the options given to you.");
                System.out.print("Enter the type of donut you'll like to have:" +
                        "1. Chocolate Frosted Donut\t" +
                        "2. Cinnamon Twist Donut\t" +
                        "3. Cream-filled Donut\t" +
                        "4. Boston Kreme Pie Donut\t");
                donut_choice = input.nextInt();
            }
        }

        Donut donut = new Donut(name,description,cost,price,calories);
        return donut;
    }

    /** returns description of the donut*/
    public String getDescription(){
        return description;
    }

    /** returns the calories in a donut*/
    public int getCalorieCount(){
        return calorieCount;
    }

    /** returns the consumption method of the donut*/
    public String getConsumptionMethod(){
        return "Eatable";
    }

    @Override
    public String toString(){
        return "Donut \t : [" + getName() + ", $"+ super.getProductionCost()+", $"+super.getRetailPrice()+"]\t"+
                "["+ getDescription()+", "+getConsumptionMethod()+", calories = "+getCalorieCount()+"]";
    }


}