<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
    
    <div class="row pb-4">
        <div class="col-3"><span class="fw-bold">Please Confirm Delete</span></div>
        <div class="col-9">The Product "${product.getTitle() }" will be permanently deleted</div>
    </div>

    <div class="row">
        <div class="col-sm-3"><span class="fw-bold">Description</span></div>
        <div class="col-sm-9">${product.getDescription() }</div>
    </div>

    <div class="mb-4">
        <form action="/product/${product.getId()}/delete" method="POST">
            <input type="submit" value="Yes, Delete" class="btn btn-sm btn-danger" />
            <a class="btn btn-sm btn-primary" href="/product/${product.getId() }">Cancel</a>
        </form>
    </div>
</div>