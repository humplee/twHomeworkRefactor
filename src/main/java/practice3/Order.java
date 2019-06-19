package practice3;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    public List<OrderLineItem> orderLineItemList;
    public List<BigDecimal> discounts;
    public BigDecimal tax;

    public Order(List<OrderLineItem> orderLineItemList, List<BigDecimal> discounts) {
        this.orderLineItemList = orderLineItemList;
        this.discounts = discounts;
        this.tax = new BigDecimal(0.1);
    }


}
