package ordercraft.project.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ordercraft.project.service.ProductService;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "product", urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    ProductService ps;
    public ProductServlet() {
        ps = new ProductService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String action = req.getServletPath();
        try {
            ps.listProduct(req, resp);
           /* switch (action){
                *//*case "/new":
                    //ps.newClientForm(req, resp);
                    break;
                case "/insert":
                    //ps.insertClient(req, resp);
                    break;
                case "/delete":
                    //ps.deleteClient(req, resp);
                    break;
                case "/edit":
                    //ps.editClient(req, resp);
                    break;
                case "/update":
                    //ps.updateClient(req, resp);
                    break;*//*
                default:
                    ps.listProduct(req, resp);
            }*/
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
