package solid.isp.order_isp_solution;

import solid.isp.order_isp_violation.Order;


public interface OrderProcessingService {

    boolean processOrder(int orderId);

}
