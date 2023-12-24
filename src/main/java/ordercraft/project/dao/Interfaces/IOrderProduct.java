package ordercraft.project.dao.Interfaces;

import ordercraft.project.model.Client;
import ordercraft.project.service.OrderProduct;

import java.util.List;

public interface IOrderProduct {
    public void insertOrderProduct(OrderProduct or);
    public int selectOrderProductById(int id);
    public List<OrderProduct> selectOrderProduct();

}
