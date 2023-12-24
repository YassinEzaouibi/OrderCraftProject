package ordercraft.project.dao.Interfaces;

import ordercraft.project.model.Client;
import ordercraft.project.model.Product;

import java.util.List;

public interface IProduct {
    public void insertProduct(Product product);
    public Product selectProductById(int id);
    public List<Product> selectAllProducts();
    public void deleteProduct(int id);

}
