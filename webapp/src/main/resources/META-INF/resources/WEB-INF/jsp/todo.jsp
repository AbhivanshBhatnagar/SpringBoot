<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>Add Todo Page</title>
    <link
      href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <div class="container">
      <h1>Enter Todo Details</h1>
      <form:form method="post" modelAttribute="todo">
        Description:
        <form:input
          type="text"
          path="description"
          placeholder="description"
          required="required"
        />
        <form:input
          type="hidden"
          path="completed"
          placeholder="description"
          required="required"
        />
        <form:input
          type="hidden"
          path="id"
          placeholder="description"
          required="required"
        />
        <input type="submit" class="btn btn-success" />
      </form:form>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
</html>
