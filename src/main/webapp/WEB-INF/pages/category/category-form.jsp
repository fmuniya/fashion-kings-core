
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<div class="container">
    <h3>Category Form</h3>
    <form action="/category/form" method="POST">
        <input type="hidden"
            name="id"
            
            class="form-control"
            value="${category.getId()}"
            id="categoryId">

        <div class="mb-3">
            <label for="categoryTitle" class="form-label">Category Title</Title></label>
            <input type="text"
            name="title"
            required
            class="form-control"
            id="categoryTitle"
            value="${category.getTitle()}"
            >
        </div>

        <div class="mb-3">
            <label for="categoryDescription" class="form-label">Description</label> 
            <textarea 
                name="description" 
                class="form-control"
                id="categoryDescription">${category.getDescription()}</textarea>           
        </div>
        <input type="submit" value="Save" class="btn btn-secondary"/>
        <input type="submit" value="Save and add another" class="btn btn-secondary"/>
        <a class="btn btn-wwarning" href="/category/list">Cancel</a>

    </form>

</div>