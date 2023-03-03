
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<div class="container">
    <h3>Product Form</h3>
    <form action="/products/form" method="POST">
        <input type="text"
            name="id"
            
            class="form-control"
            value="0"
            id="productId">

        <div class="mb-3">
            <label for="productTitle" class="form-label">product Title</Title></label>
            <input type="text"
            name="title"
            required
            class="form-control"
            id="productTitle"
            value="">
        </div>

        <div class="mb-3">
            <label for="productDescription" class="form-label">Description</label> 
            <textarea 
                name="description" 
                class="form-control"
                id="productDescription">
            </textarea>           
        </div>
        <input type="submit" value="Save" class="btn btn-secondary"/>
        <input type="submit" value="Save and add another" class="btn btn-secondary"/>
        <a class="btn btn-wwarning" href="/product/list">Cancel</a>

    </form>

</div>