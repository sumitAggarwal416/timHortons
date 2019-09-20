/**
 * @author Sumit Aggarwal; 000793607
 * This class creates an order of Tims Products
 */

import java.util.Scanner;

public class TimsOrder {
    /** size of the order */
    private int size;
    /** user's name*/
    private String name;
    /** array containing the items in the order */
    private TimsProduct[] p;

    private TimsOrder(String name, int size){
        this.name = name;
        this.size = size;
    }

    /** get user information and details about their order */
    public static TimsOrder create(){

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        /** name of the customer*/
        String name = input.nextLine();
        System.out.print("How many items would you like to order today? ");
        int size = input.nextInt();
        TimsProduct[] p = new TimsProduct[size];
        /** item number of  the customer's order in the array*/
        int item = 0;
        /** total order price*/
        double price = 0;
        int choice;
        /** loop control variable*/
        int count = size;
        /** runs until all the items ordered are added to the array*/
        while(count>0){
            System.out.println("Welcome! What would you like to order today:" +
                    "1. Coffee\t" +
                    "2. Donut\t" +
                    "3. Mug\t" +
                    "4. Hat");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    Coffee coffee = Coffee.create();
                    p[item] = coffee;
                    price += coffee.getRetailPrice();
                    item++;
                    count--;
                    break;
                case 2:
                    Donut donut = Donut.create();
                    p[item]=donut;
                    price += donut.getRetailPrice();
                    item++;
                    count--;
                    break;
                case 3:
                    Mug mug = Mug.create();
                    p[item] = mug;
                    price += mug.getRetailPrice();
                    item++;
                    count--;
                    break;
                case 4:
                    Hat hat = Hat.create();
                    p[item] = hat;
                    price += hat.getRetailPrice();
                    item++;
                    count--;
                    break;
            }
        }

        /** prints the order*/
        for(int i=0; i<p.length;i++){
            System.out.println(p[i]);
        }
        System.out.println("Your total is: " + price);
        TimsOrder order = new TimsOrder(name,size);

        return order;

    }

    /** returns the total amount due*/
    public double getAmountDue(){
        double total = 0;
        p = new TimsProduct[size];
        for(int i=0;i<p.length;i++){
            total = p[i].getRetailPrice();
        }
        return total;
    }

    @Override
    public String toString(){
        return "Order for: "+ name + " containing " + size + " items";
    }
}
