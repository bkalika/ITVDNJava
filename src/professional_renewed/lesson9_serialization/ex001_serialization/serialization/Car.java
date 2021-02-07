package professional_renewed.lesson9_serialization.ex001_serialization.serialization;

import java.io.Serializable;

public class Car implements Serializable {
    private int price;
    private String model;

    Car(int price, String model){
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString(){
        return "Client{" +
                "price=" + price +
                ", model ='" + model + '\'' +
                "}";
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }
}
