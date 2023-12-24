package ordercraft.project.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ordercraft.project.service.ClientService;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "client", urlPatterns = {"/", "/client", "/client/*"})
public class ClientServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    ClientService cs;
    public ClientServlet() {
        cs = new ClientService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getServletPath();
        try {
            switch (action){
                case "/new":
                    cs.newClientForm(req, resp);
                    break;
                case "/insert":
                    cs.insertClient(req, resp);
                    break;
                case "/delete":
                    cs.deleteClient(req, resp);
                    break;
                case "/edit":
                    cs.editClient(req, resp);
                    break;
                case "/update":
                    cs.updateClient(req, resp);
                    break;
                default:
                    cs.listClient(req, resp);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
