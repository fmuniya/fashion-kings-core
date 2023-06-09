<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
    <div class="mb-4">
        <a class="btn btn-sm btn-warning" href="<c:out value="/category/form/${category.id}"/>">Edit</a>
        <a class="btn btn-sm btn-danger" href="/category/${category.getId()}/delete">Delete</a>
        <a class="btn btn-sm btn-dark" href="<c:out value="/category/${category.id}/products"/>">View products</a>
        <a class="btn btn-sm btn-primary" href="/category/form">Add a Category</a>
    </div>

    <div class="row">
        <div class="col-5">
            <div class="row pb-4">
                <div class="col-3"><span class="fw-bold">Category Title</span></div>
                <div class="col-9">${category.getTitle()}</div>
            </div>

            <div class="row">
                <div class="col-sm-3"><span class="fw-bold">Description</span></div>
                <div class="col-sm-9">${category.getDescription()}</div>

                <img src="/console/category/images/1" alt="image"/>
            </div>
        </div>

       <!--  
            finish off code here
            <div class="col-5">
                <div class="corver-container">

                    <form runat="server" action="/console/category/1/upload" method="POST" enctype="multipart/form-data">
                        <label for="imgInp" id="drop-container">
                            <span class="drop-title">Upload Cover</span>
                            <input name="file" type="file" id="imgInp" accept="image/*" required>
                        </label>
                        <div id="preview-box">
                            <img id="blah" src="#" alt="your image" />
                            <div class="mt-2">
                                <input type="submit" value="Confirm Upload" class="btn btn-light" />
                                <button class="btn btn-light" onclick="changeCorver(); return false">Change</button>
                            </div>
                        </div>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    </form> 
                </div>
            </div> 
    -->


    </div>

</div>