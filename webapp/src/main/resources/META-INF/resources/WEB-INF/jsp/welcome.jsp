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
      <div>Your name is ${username}</div>
      <div><a href="list-todos">Manage</a> your todos</div>
      <!-- <div>Your password is ${password}</div> -->
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
</html>
