package ordercraft.project.service;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ordercraft.project.dao.ClientDao;
import ordercraft.project.model.Client;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ClientService {
    ClientDao clientDao;
    public void listClient(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        clientDao = new ClientDao();
        List<Client> clientList = clientDao.selectAllClients();
        request.setAttribute("clientList", clientList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("client-list.jsp");
        dispatcher.forward(request, response);
    }
    public void newClientForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("client-form.jsp");
        dispatcher.forward(request, response);
    }


    public void insertClient (HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("phone");
        Client newClient = new Client(name, email, country);
        clientDao.insertClient(newClient);
        response.sendRedirect("list");
    }
    public void updateClient(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        Client updatedClient = new Client(name, email, phone);
        clientDao.updateClient(updatedClient);
        response.sendRedirect("list");
    }
    public void deleteClient(HttpServletRequest request, HttpServletResponse response)
    throws SQLException, IOException{
        String email = request.getParameter("email");
        clientDao.deleteClient(email);
        response.sendRedirect("list");
    }
    public void editClient(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String email = request.getParameter("email");
        Client existingUser = clientDao.selectClientByEmail(email);
        RequestDispatcher dispatcher = request.getRequestDispatcher("client-form.jsp");
        request.setAttribute("client", existingUser);
        dispatcher.forward(request, response);
    }
}
