public abstract class Instrument implements ISell, IPlay {


    private String model;
    private String make;
    private double cost;
    private double price;


    public Instrument(String model, String make, double cost, double price){

        this.model = model;
        this.make = make;
        this.cost = cost;
        this.price = price;

    }

    public String getModel(){

        return this.model;
    }

    public String getMake(){

        return this.make;
    }


    public double getCost(){

        return this.cost;
    }

    public double getPrice(){

        return this.price;
    }

    public String playInstrument(){

        return "Twang";
    }

    public double calculateMarkup(){

        return this.price - this.cost;


    }

}