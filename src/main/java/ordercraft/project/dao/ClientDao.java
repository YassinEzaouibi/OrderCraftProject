package ordercraft.project.dao;

import ordercraft.project.DataBase.ConnectDataBase;
import ordercraft.project.dao.Interfaces.IClient;
import ordercraft.project.model.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ClientDao implements IClient {
    private static final String INSERT_USERS_SQL = "INSERT INTO client" + "  (name, email, phone) VALUES " +
            " (?, ?, ?);";
    private static final String SELECT_USER_BY_EMAIL = "select id_client,name,email,phone from client where email =?";
    private static final String SELECT_ALL_CLIENTS = "select * from client";
    private static final String DELETE_CLIENT = "delete from client where email = ?;";
    private static final String UPDATE_CLIENT = "update client set name = ?,email= ?, phone =? where email = ?;";

    public ClientDao(){}
    public void insertClient(Client client){
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
    }
    public Client selectClientByEmail(String email){
        Client client = null;
        try(Connection cnx = ConnectDataBase.getInstance();
            PreparedStatement preparedStatement = cnx.prepareStatement(SELECT_USER_BY_EMAIL))
        {
            preparedStatement.setString(1, email);
            //System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("id_client");
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                client = new Client(id, name, email, phone);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return client;
    }
    public List<Client> selectAllClients(){
        List<Client> client = new ArrayList<>();
        try (Connection cnx = ConnectDataBase.getInstance();
             Statement statement = cnx.createStatement()){
             ResultSet resultSet = statement.executeQuery("select * from client");
             while (resultSet.next()) {
                int id = resultSet.getInt("id_client");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                client.add(new Client(id, name, email, phone));
             }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return client;
    }
    public void deleteClient(String email) {
        //boolean rowDeleted = false;
        try (Connection cnx = ConnectDataBase.getInstance();
             PreparedStatement preparedStatement = cnx.prepareStatement(DELETE_CLIENT))
        {
            preparedStatement.setString(1, email);
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
        //return rowDeleted;
    }
    public void updateClient(Client client) throws SQLException {
        try (Connection cnx = ConnectDataBase.getInstance();
            PreparedStatement preparedStatement = cnx.prepareStatement(UPDATE_CLIENT)){
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setString(3, client.getPhone());
            preparedStatement.setInt(4, client.getId());
            preparedStatement.executeUpdate();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
