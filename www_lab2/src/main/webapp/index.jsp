<%@ page import="com.example.www_lab2.model.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.www_lab2.services.ProductServices" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h1 class="text-center"><%= "Hello World!" %></h1>
<a link=""></a>
<br/>
<div class="container">
<%ProductServices productServices = new ProductServices();%>
<% List<Product> list =  productServices.findAll();//(List<Product>) request.getAttribute("products"); %>
<%if(list!=null){%>
  <div class="row">
<% for (Product product : list) { %>
  <div class="col-3">
    <div class="card" style="margin: 5px">
      <div class="card-body">
        <h5 class="card-title">Name: <%=product.getName()%></h5>
        <h6>Manufacture: <%=product.getManufacturerName()%></h6>
        <h6>Status: <%=product.getStatus()%></h6>
        <p class="card-text">Description: <%=product.getDescription()%></p>
        <a href="#" class="btn btn-primary">Add to cart</a>
    </div>
    </div>
</div>
<% }

}else{
    out.println("No products found");
} %>
</div>

</div>

</body>
</html>