public class Items implements ISell{

    private double price;
    private double cost;
    private String name;


    public Items (double price, double cost, String name){

        this.price = price;
        this.cost = cost;
        this.name = name;

    }

    public double calculateMarkup(){

        return this.price - this.cost;


    }


    public double getCost(){

        return this.cost;
    }

    public double getPrice(){

        return this.price;
    }

    public String getName(){

        return this.name;
    }
}
