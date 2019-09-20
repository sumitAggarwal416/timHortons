/**
 * @author Sumit Aggarwal; 000793607
 *This class defines a Tims Product
 */
public abstract class TimsProduct implements Comodity{
    /** name of the product*/
    private String name;
    /** production cost of the product*/
    private double cost;
    /** retail price of the product*/
    private double price;

    public TimsProduct( String name, double cost, double price){
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /**returns name of the product*/
    public String getName(){
        return name;
    }

    /** returns production cost of the product*/
    public double getProductionCost(){
        return cost;
    }

    /** returns retail price of the product*/
    public double getRetailPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "Name is " + name + "cost is " + cost + "retail price is " + price ;
    }

}




