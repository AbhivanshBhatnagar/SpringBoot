<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>WELCOME PAGE</title>
    <link
      href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <%@ include file="common/nav.jspf"%>
    <div class="container">
      <h2>Welcome to Welcome Page</h2>
      <!-- <div>Your todos are ${todos}</div> -->

      <table class="table">
        <thead>
          <tr>
            <th>ID</th>
            <th>Description</th>
            <!-- <th>Name</th> -->
            <th>Target Date</th>
            <th>Is completed</th>
            <th></th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          <c:forEach items="${todos}" var="todo">
            <tr>
              <td>${todo.id}</td>
              <td>${todo.description}</td>
              <!-- <td>${todo.name}</td> -->
              <td>${todo.targetDate}</td>
              <td>${todo.completed}</td>
              <td>
                <a href="delete-todo?id=${todo.id}" class="btn btn-warning"
                  >Delete</a
                >
              </td>
              <td>
                <a href="update-todo?id=${todo.id}" class="btn btn-success"
                  >Update</a
                >
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
      <a href="add-todo" class="btn btn-success">Add todo</a>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
</html>
