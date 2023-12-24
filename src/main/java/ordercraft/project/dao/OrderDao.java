package ordercraft.project.dao;

import ordercraft.project.DataBase.ConnectDataBase;
import ordercraft.project.dao.Interfaces.IOrder;
import ordercraft.project.model.Order;
import ordercraft.project.model.Status;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDao implements IOrder {
    @Override
    public void insertOrder(Order order) {
        try(Connection cnx = ConnectDataBase.getInstance();
            PreparedStatement preparedStatement = cnx.prepareStatement("INSERT INTO commande" + "  (creationDate, idClient, Status) VALUES " + " (?, ?, ?)");
            ){
            preparedStatement.setDate(1, (java.sql.Date) order.getCreationDate());
            preparedStatement.setInt(2, order.getClientId());
            preparedStatement.setString(3, order.getStatus());
            // System.out.println(preparedStatement);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /*
    *  public void insertClient(Client client){
        //System.out.println(INSERT_USERS_SQL);
        try(Connection cnx = ConnectDataBase.getInstance();
            PreparedStatement preparedStatement = cnx.prepareStatement("INSERT INTO client" + "  (name, email, phone) VALUES " + " (?, ?, ?);"))
        {
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setString(3, client.getPhone());
           // System.out.println(preparedStatement);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }*/

    @Override
    public Order selectOrderById(int id) {
        return null;
    }

    @Override
    public List<Order> selectAllOrders() {
        List<Order> Order = new ArrayList<>();
        try (Connection cnx = ConnectDataBase.getInstance();
             Statement statement = cnx.createStatement()){
            ResultSet resultSet = statement.executeQuery("select * from commande");
            while (resultSet.next()) {
                int id = resultSet.getInt("id_cmd");
                Date creationDate = resultSet.getDate("date_creation");
                Date modificationDate = resultSet.getDate("date_modification");
                int clientId = resultSet.getInt("id_client");
                Status status = Status.valueOf(resultSet.getString("status"));
                Order.add(new Order(id, creationDate, modificationDate, clientId, status));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return Order;
    }

    @Override
    public void deleteOrder(int id) {

    }
}
