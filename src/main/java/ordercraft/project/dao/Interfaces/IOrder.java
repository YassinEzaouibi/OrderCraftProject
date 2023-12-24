package ordercraft.project.dao.Interfaces;

import ordercraft.project.model.Order;
import ordercraft.project.model.Product;

import java.util.List;

public interface IOrder {
    public void insertOrder(Order order);
    public Order selectOrderById(int id);
    public List<Order> selectAllOrders();
    public void deleteOrder(int id);
}
