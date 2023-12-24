<%--
  Created by IntelliJ IDEA.
  User: zouib
  Date: 12/23/2023
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--org.apache.jsp.client_002dlist_jsp--%>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Client Management Application</title>
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100">
<header>
  <div class="bg-indigo-900 max-w-full mx-auto px-4 sm:px-6">
    <div class="flex flex-row justify-between border-b border-indigo-400 border-opacity-25 py-6 md:justify-start md:space-x-10">
      <div class="flex justify-start lg:w-0 lg:flex-1">
        <h1 class="text-xl font-bold font-normal text-indigo-400">Orders Management System</h1>
      </div>
      <div class="end-3/3 space-x-10 pr-12">
        <a href="<%=request.getContextPath()%>/" class="whitespace-nowrap text-base font-medium text-indigo-300 hover:text-white"> Clients </a>
        <a href="<%=request.getContextPath()%>/product" class="whitespace-nowrap text-base font-medium text-indigo-300 text-white"> Products </a>
        <a href="<%=request.getContextPath()%>/order" class="whitespace-nowrap text-base font-medium text-indigo-300 hover:text-white"> Orders </a>
      </div>
    </div>
  </div>
</header>
<br>

<div class="container mx-auto mt-8">
  <h3 class="text-3xl font-semibold text-center">List of Products</h3>
  <hr class="my-4">

  <div class="flex justify-end mb-4">
    <a href="<%=request.getContextPath()%>/new" class="bg-indigo-900 font-medium text-base text-indigo-300 py-2 px-4 rounded hover:text-white">Add New Product</a>
  </div>

  <table class="table-auto w-full border">
    <thead>
    <tr>
      <th class="border">ID</th>
      <th class="border">Name</th>
      <th class="border">Quantity</th>
      <th class="border">Type</th>
      <th class="border">Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${productList}">
      <tr>
        <td class="border">${product.productId}</td>
        <td class="border">${product.productName}</td>
        <td class="border">${product.productQuantity}</td>
        <td class="border">${product.productType}</td>
        <td class="border">
          <a href="edit?id=${product.productId}" class="text-blue-500 mr-2">Edit</a>
          <a href="delete?id=${product.productId}" class="text-red-500">Delete</a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>

</body>
</html>

