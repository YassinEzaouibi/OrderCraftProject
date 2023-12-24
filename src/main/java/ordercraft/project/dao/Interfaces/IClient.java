package ordercraft.project.dao.Interfaces;

import ordercraft.project.model.Client;

import java.util.List;

public interface IClient {
    public void insertClient(Client client);
    public Client selectClientByEmail(String email);
    public List<Client> selectAllClients();
    public void deleteClient(String email);

}
