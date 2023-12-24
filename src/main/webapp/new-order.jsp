<%--
  Created by IntelliJ IDEA.
  User: zouib
  Date: 12/24/2023
  Time: 1:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Client Management Application</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>

<!-- Contact section -->
<header>
    <div class="bg-indigo-900 max-w-full mx-auto px-4 sm:px-6">
        <div class="flex flex-row justify-between border-b border-indigo-400 border-opacity-25 py-6 md:justify-start md:space-x-10">
            <div class="flex justify-start lg:w-0 lg:flex-1">
                <h1 class="text-xl font-bold font-normal text-indigo-400">Orders Management System</h1>
            </div>
            <div class="end-3/3 space-x-10 pr-12">
                <a href="<%=request.getContextPath()%>/" class="whitespace-nowrap text-base font-medium text-indigo-300 hover:text-white"> Clients </a>
                <a href="<%=request.getContextPath()%>/product" class="whitespace-nowrap text-base font-medium text-indigo-300 hover:text-white"> Products </a>
                <a href="<%=request.getContextPath()%>/order" class="whitespace-nowrap text-base font-medium text-indigo-300 hover:text-white"> Orders </a>
            </div>
        </div>
    </div>
</header>
<section class="relative bg-white">
    <!-- Decorative dot pattern -->
    <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
        <div class="relative bg-white shadow-xl">
            <h2 id="contact-heading" class="sr-only">Contact us</h2>
            <!-- Contact form -->
            <div class="py-10 px-6 sm:px-10 lg:col-span-2 xl:p-12">
                <h3 class="text-lg font-medium text-warm-gray-900">Create new Order</h3>
                <form action="#" method="POST" class="mt-6 grid grid-cols-1 gap-y-6 sm:grid-cols-2 sm:gap-x-8">
                    <div>
                        <label for="countries" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Select Client</label>
                        <select id="countries" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500">
                            <option selected>Choose a country</option>
                            <option value="US">United States</option>
                            <option value="CA">Canada</option>
                            <option value="FR">France</option>
                            <option value="DE">Germany</option>
                        </select>
                    </div>
                    <div>
                        <label for="countries" class="block mb-2 text-sm font-medium text-gray-900 dark:text-white">Select Product</label>
                        <select id="countries" class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500">
                            <option selected>Choose a country</option>
                            <option value="US">United States</option>
                            <option value="CA">Canada</option>
                            <option value="FR">France</option>
                            <option value="DE">Germany</option>
                        </select>
                    </div>
                    <div>
                        <label for="email" class="block text-sm font-medium text-warm-gray-900">Quantity</label>
                        <div class="mt-1">
                            <input id="number" name="number" type="number" class="py-3 px-4 block w-full shadow-sm text-warm-gray-900 focus:ring-teal-500 focus:border-teal-500 border-warm-gray-300 rounded-md">
                        </div>
                    </div>
                    <div class="sm:col-span-2">
                        <label for="subject" class="block text-sm font-medium text-warm-gray-900">price</label>
                        <div class="mt-1">
                            <label for="subject" class="py-3 px-4 block w-full shadow-sm text-warm-gray-900 focus:ring-teal-500 focus:border-teal-500 border-warm-gray-300 rounded-md">price</label>
                        </div>
                    </div>
                    <div>
                        <div class="flex justify-between">
                            <label for="phone" class="block text-sm font-medium text-warm-gray-900">Date</label>
                        </div>
                        <div class="mt-1">
                            <input type="datetime-local" name="Date" id="Date" class="py-3 px-4 block w-full shadow-sm text-warm-gray-900 focus:ring-teal-500 focus:border-teal-500 border-warm-gray-300 rounded-md" aria-describedby="phone-optional">
                        </div>
                    </div>
                    <div class="sm:col-span-2">
                        <label for="subject" class="block text-sm font-medium text-warm-gray-900">Status</label>
                        <div class="mt-1">
                            <label for="subject" class="py-3 px-4 block w-full shadow-sm text-warm-gray-900 focus:ring-teal-500 focus:border-teal-500 border-warm-gray-300 rounded-md">pending</label>
                        </div>
                    </div>
                    <div class="sm:col-span-2 sm:flex sm:justify-end">
                        <button type="submit" class="mt-2 w-full inline-flex items-center justify-center px-6 py-3 border border-transparent rounded-md shadow-sm text-base font-medium text-indigo-300 bg-indigo-900 hover:text-white focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-teal-500 sm:w-auto">Submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    </div>
</section>

</body>
</html>
