package ordercraft.project.dao;

import ordercraft.project.DataBase.ConnectDataBase;
import ordercraft.project.dao.Interfaces.IOrderProduct;
import ordercraft.project.model.Client;
import ordercraft.project.service.OrderProduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OrderProductDao implements IOrderProduct {
    @Override
    public void insertOrderProduct(OrderProduct or){
        try(Connection cnx = ConnectDataBase.getInstance();
            PreparedStatement preparedStatement =
                    cnx.prepareStatement("INSERT INTO commande_produit" + "  (id_cmd, id_produit, quantite) VALUES " + " (?, ?, ?)")){
            preparedStatement.setInt(1, or.getIdOrder());
            preparedStatement.setInt(2, or.getIdOrderProduct());
            preparedStatement.setInt(3, or.getQuantityProductOrdered());
            // System.out.println(preparedStatement);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }



    @Override
    public int selectOrderProductById(int id) {
        return 0;
    }

    @Override
    public List<OrderProduct> selectOrderProduct() {
        return null;
    }
}
