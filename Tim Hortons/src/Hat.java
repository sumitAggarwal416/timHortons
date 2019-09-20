/**
 * @author Sumit Aggarwal; 000793607
 */

import javafx.scene.paint.Color;

import java.util.Scanner;

public class Hat extends TimsProduct {
    /** color of the hat*/
    private Color color;
    /** String value of the color*/
    private String color_type;

    private Hat( String name, double cost, double price, Color COLOR,String Color_type){
        super(name,cost,price);
        color = COLOR;
        color_type=Color_type;
    }

    /** get user information about their hat to create*/
    public static Hat create(){
        /** name of the product*/
        String name = "" ;
        /**color of the hat*/
        String color_type="";
        Color color = Color.RED;
        /** production cost of the hat*/
        double cost = 0.25;
        /** retail price of the hat*/
        double price = 1.65;
        /** returns true if user has ordered the hat, false otherwise*/
        boolean ordered = true;
        Scanner input = new Scanner(System.in);
        /** runs until data entered by the user is valid*/
        while(ordered){
            System.out.println("Enter the color of tha hat you would like to have:" +
                    "1. Blue" +
                    "2. Red" +
                    "3. White");
        int hat_choice = input.nextInt();
        if(hat_choice>=1 && hat_choice<=3){
            switch (hat_choice){
                case 1:
                    name = "Blue Jays Hat";
                    color = Color.BLUE;
                    color_type="Blue";
                    ordered = false;
                    break;
                case 2:
                    name = "Raptors Hat";
                    color = Color.RED;
                    color_type = "Red";
                    ordered = false;
                    break;
                case 3:
                    name = "Real Madrdid  Hat";
                    color = Color.WHITE;
                    color_type = "White";
                    ordered = false;
                    break;
            }
        }
        else{
            System.out.println("Invalid entry. Please enter an item that is available");
            System.out.println("Enter the color of tha hat you would like to have:" +
                    "1. Blue" +
                    "2. Red" +
                    "3. White");
            hat_choice = input.nextInt();
        }
        }

        Hat hat = new Hat(name,cost,price,color,color_type);
        return hat;
    }

    /** returns the color of the hat*/
    public String getColor(){
        return color_type;
    }

    public String toString(){
        return "Hat \t : [" + getName()+", $" + super.getProductionCost() + ", $" + super.getRetailPrice() + "] "+
                "[ "+getColor()+"]";
    }
}
