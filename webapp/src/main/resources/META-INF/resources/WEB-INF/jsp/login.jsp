<html>
  <head>
    <title>LOGIN PAGE</title>
    <link
      href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <div class="container">
      <h2>Welcome to Login Page</h2>
      <pre>${errorMessage}</pre>
      <form method="post">
        <input
          type="text"
          name="username"
          placeholder="username"
          required="required"
        />
        <input
          type="password"
          name="password"
          placeholder="password"
          required="required"
        />
        <input type="submit" value="Login" />
      </form>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
</html>
