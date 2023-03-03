
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>Products</h1>

<table class="table table-striped">
    <thead>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Status</th>
            <th>Actions</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach var="products" items="${products}" >
            <tr>
                <td>${products.getTitle()}</td>
                <td>${products.getDescription()}</td>
                <td>active</td>
                <td>actions</td>
            </tr>
        </c:forEach>
    </tbody>
</table>