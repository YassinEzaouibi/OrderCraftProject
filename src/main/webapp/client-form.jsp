<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>

<head>
    <title>Client Management Application</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>

<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark" style="background-color: tomato">
        <div>
            <a href="https://www.javaguides.net" class="navbar-brand"> Clients Management App </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Clients</a></li>
        </ul>
    </nav>
</header>
<br>
<div class="container col-md-5">
    <div class="card">
        <div class="card-body">
            <c:if test="${client != null}">
            <form action="update" method="post">
                </c:if>
                <c:if test="${client == null}">
                <form action="insert" method="post">
                    </c:if>

                    <caption>
                        <h2>
                            <c:if test="${client != null}">
                                Edit Client
                            </c:if>
                            <c:if test="${client == null}">
                                Add New Client
                            </c:if>
                        </h2>
                    </caption>

                    <c:if test="${client != null}">
                        <input type="hidden" name="id" value="<c:out value='${client.id}' />" />
                    </c:if>

                    <fieldset class="form-group">
                        <label>Client Name</label> <input type="text" value="<c:out value='${client.name}' />" class="form-control" name="name" required="required">
                    </fieldset>

                    <fieldset class="form-group">
                        <label>Client Email</label> <input type="text" value="<c:out value='${client.email}' />" class="form-control" name="email">
                    </fieldset>

                    <fieldset class="form-group">
                        <label>Client Phone</label> <input type="text" value="<c:out value='${client.phone}' />" class="form-control" name="phone">
                    </fieldset>

                    <button type="submit" class="btn btn-success">Save</button>
                </form>
        </div>
    </div>
</div>
</body>

</html>