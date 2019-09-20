/**
 * @author Sumit Aggrawal; 000793607
 * This class creates the mug which is a TimsProduct
 */

import javafx.scene.paint.Color;
import java.util.Scanner;

public class Mug extends TimsProduct {
    /** color of the mug*/
    private Color color;
    /** String value of the color*/
    private String color_type;
    private Mug(String name, double cost, double price, Color COLOR,String Color_type){
        super(name,cost,price);
        color = COLOR;
        color_type = Color_type;
    }

    /** get information from the user to create a Mug*/
    public static Mug create(){
        /** name of the mug*/
        String name = "";
        /** color of the mug*/
        Color color = Color.WHITE;
        String color_type="";
        /** production cost of the mug*/
        double cost = 1.50;
        /** retail price of the mug*/
        double price = 3.50;
        /** returns true if user has ordered the mug, false otherwise*/
        boolean ordered = true;
        Scanner input = new Scanner(System.in);

        /** runs until the user enters the correct values*/
        while(ordered){
            System.out.println("Enter the color of the mug you'd like:" +
                    "1. Red" +
                    "2. Brown");
            int mug_choice = input.nextInt();
            if(mug_choice==1 || mug_choice==2){
                switch (mug_choice){
                    case 1:
                        name = "Kids Red Mug";
                        color = Color.RED;
                        color_type = "Red";
                        ordered = false;
                        break;
                    case 2:
                        name = "Coffee Mug";
                        color = Color.BROWN;
                        color_type = "Brown";
                        ordered = false;
                        break;
                }
            }
            else{
                System.out.println("Please enter the item from the given options");
                System.out.println("Enter the color of the mug you'd like:" +
                        "1. Red" +
                        "2. Brown");
                mug_choice = input.nextInt();
            }
        }
        Mug mug = new Mug(name,cost,price,color,color_type);
        return mug;
    }

    /** returns String value of the color*/
    public String getColor(){
       return color_type;
    }

    @Override
    public String toString(){
        return "Mug \t : [" + getName()+", $" + super.getProductionCost() + ", $" + super.getRetailPrice() + "] "+
                "[ "+getColor()+"]";
    }
}