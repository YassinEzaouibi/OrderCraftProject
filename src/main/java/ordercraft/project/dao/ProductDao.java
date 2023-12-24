package ordercraft.project.dao;

import ordercraft.project.DataBase.ConnectDataBase;
import ordercraft.project.dao.Interfaces.IProduct;
import ordercraft.project.model.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements IProduct {
    @Override
    public void insertProduct(Product product) {

    }

    @Override
    public Product selectProductById(int id) {
        return null;
    }

    @Override
    public List<Product> selectAllProducts() {
        List<Product> product = new ArrayList<>();
        try (Connection cnx = ConnectDataBase.getInstance();
             Statement statement = cnx.createStatement()){
             ResultSet resultSet = statement.executeQuery("select * from produit");
             while (resultSet.next()) {
                int id = resultSet.getInt("id_produit");
                String name = resultSet.getString("name");
                int quantity = resultSet.getInt("quantite");
                String type = resultSet.getString("type");
                product.add(new Product(id, name, quantity, type));
             }
        }catch (SQLException e){
            e.printStackTrace();
       }
        return product;
    }

    @Override
    public void deleteProduct(int id) {

    }
}
