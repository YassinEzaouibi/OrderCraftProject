package ordercraft.project.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ordercraft.project.service.OrderService;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "order", urlPatterns = {"/order"})
public class OrderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    OrderService os;
    public OrderServlet() {
        os = new OrderService();
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
                    os.newOrderForm(req, resp);
                    break;
                case "/insert":
                    //os.insertOrder(req, resp);
                    break;
                case "/delete":
                    //ps.deleteOrder(req, resp);
                    break;
                case "/edit":
                    //ps.editOrder(req, resp);
                    break;
                case "/update":
                    //ps.updateOrder(req, resp);
                    break;
                default:
                    os.listOrder(req, resp);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
