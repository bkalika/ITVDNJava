package solid.isp.isp_violation_and_solution;

import java.util.Date;
import java.util.List;

public class I implements  I1, I2{
    private Customer customer;
    private List<Product> products;

    public I(Customer customer, List<Product> products){
        this.customer = customer;
        this.products = products;
    }

    @Override
    public String getName(){
        return customer.getName();
    }

    public Date getDate(){
        return new Date();
    }
}
