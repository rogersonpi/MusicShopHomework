
import java.util.ArrayList;


public class Shop  {

    ArrayList<ISell> stock;

    public Shop(){

        stock = new ArrayList<>();
    }

    public void addItem (ISell item){

        this.stock.add(item);
    }

    public void removeItem (ISell item){

        this.stock.remove(item);

    }
    public int countItems(){

        return this.stock.size();
    }


}




