package jdbc_hibernate.lesson2_dao.simple_dao.entity;

public class Car {
    private long id;
    private String mark;
    private String model;
    private double price;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getMark(){
        return mark;
    }

    public void setMark(String mark){
        this.mark = mark;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }


}
