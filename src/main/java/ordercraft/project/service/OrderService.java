package ordercraft.project.service;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ordercraft.project.dao.OrderDao;
import ordercraft.project.model.Order;
import ordercraft.project.model.Status;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class OrderService {
    OrderDao orderDao;
    public void listOrder(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        orderDao = new OrderDao();
        List<Order> orderList = orderDao.selectAllOrders();
        request.setAttribute("orderList", orderList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("orders-list.jsp");
        dispatcher.forward(request, response);
    }
    public void newOrderForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("new-order.jsp");
        dispatcher.forward(request, response);
    }
    public void insertOrder (HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        Date creationDate = Date.valueOf(request.getParameter("order-date"));
        int clientId = Integer.parseInt(request.getParameter("client-id"));
        Status status = Status.valueOf(request.getParameter("status"));
        Order newOrder = new Order(creationDate, clientId, status);
        orderDao.insertOrder(newOrder);

        response.sendRedirect("list");
    }
}
