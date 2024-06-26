<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>Add Todo Page</title>
    <link
      href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
      rel="stylesheet"
    />
    <link
      href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css"
      rel="stylesheet"
    />
  </head>
  <body>
    <%@ include file="common/nav.jspf"%>
    <div class="container">
      <h1>Enter Todo Details</h1>
      <form:form method="post" modelAttribute="todo">
        Description:
        <fieldset class="mb-3">
          <form:input
            type="text"
            path="description"
            placeholder="description"
            required="required"
          />
          <form:label path="description">Description</form:label>
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
          <form:errors path="description" cssClass="text-warning" />
        </fieldset>
        <fieldset class="mb-3">
          <form:input
            type="text"
            path="targetDate"
            placeholder="targetDate"
            required="required"
          />
          <form:label path="targetDate">Target Date</form:label>
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
          <form:errors path="targetDate" cssClass="text-warning" />
        </fieldset>
        <input type="submit" class="btn btn-success" />
      </form:form>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script type="text/javascript">
      $("#targetDate").datepicker({
        format: "yyyy-mm-dd",
      });
    </script>
  </body>
</html>
