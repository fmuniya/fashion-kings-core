<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
    <h3>
        <span>Product List</span>
        <a class="btn btn-sm btn-primary" href="/product/form">Add a Product</a>
    </h3>
</div>
<table class="table table-striped">
    <thead>
        <tr>
            <th>Title</th>
            <th>Price (&euro;)</th>
            <th>Stock Quantity</th>
            <th>Discount %</th>
            <th>Actions</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach items="${products}" var="product">
            
            <tr>
                <td>${product.getTitle() }</td>
                <td>${product.getPrice() }</td>
                <td>${product.getStockQuantity() }</td>
                <td>${product.getDiscountPercent() }</td>
                <td>
                    <a class="btn btn-sm btn-warning" href="<c:out value ="/product/form/${product.id}"/>">Edit</a>
                    <a class="btn btn-sm btn-warning" href="<c:out value ="/product/${product.id}/"/>">View</a>
                    <a class="btn btn-sm btn-dark" href="<c:out value ="/product/form/${product.id}/product"/>">View Product</a>
                    <a class="btn btn-sm btn-danger" href="/product/${product.getId()}/delete">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>