package ordercraft.project.service;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ordercraft.project.dao.ProductDao;
import ordercraft.project.model.Product;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ProductService {
    ProductDao productDao;
    public void listProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        productDao = new ProductDao();
        List<Product> productList = productDao.selectAllProducts();
        request.setAttribute("productList", productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product-list.jsp");
        dispatcher.forward(request, response);
    }
}
