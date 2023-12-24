<%--
  Created by IntelliJ IDEA.
  User: zouib
  Date: 12/22/2023
  Time: 3:29 PM
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
                        <a href="<%=request.getContextPath()%>/" class="whitespace-nowrap text-base font-medium text-indigo-300 text-white"> Clients </a>
                        <a href="<%=request.getContextPath()%>/product" class="whitespace-nowrap text-base font-medium text-indigo-300 hover:text-white"> Products </a>
                        <a href="<%=request.getContextPath()%>/order" class="whitespace-nowrap text-base font-medium text-indigo-300 hover:text-white"> Orders </a>
                    </div>
                </div>
            </div>
        </header>
        <br>

        <div class="container mx-auto mt-8">
            <h3 class="text-3xl font-semibold text-center">List of Clients</h3>
            <hr class="my-4">

            <div class="flex justify-end mb-4">
                <a href="<%=request.getContextPath()%>/new" class="bg-indigo-900 font-medium text-base text-indigo-300 py-2 px-4 rounded hover:text-white">Add New Client</a>
            </div>

            <table class="table-auto w-full border">
                <thead>
                <tr>
                    <th class="border">ID</th>
                    <th class="border">Name</th>
                    <th class="border">Email</th>
                    <th class="border">Phone</th>
                    <th class="border">Actions</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="client" items="${clientList}">
                    <tr>
                        <td class="border">${client.id}</td>
                        <td class="border">${client.name}</td>
                        <td class="border">${client.email}</td>
                        <td class="border">${client.phone}</td>
                        <td class="border">
                            <a href="edit?id=${client.id}" class="text-blue-500 mr-2">Edit</a>
                            <a href="delete?id=${client.id}" class="text-red-500">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

    </body>
</html>
