<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div class="row mt-4 justify-content-center">
        <c:forEach items="${page.content}" var="p">
            <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
                <div class="card" style="width: 18rem;">
                    <img src="/images/${p.image}" width="100%" height="200px" class="card-img-top" alt="...">
                    <div class="card-body">
                        <a href="/product/detail/${p.id}">
                            <h5 class="card-title">${p.name}</h5>
                        </a>
                        <p class="card-text">${p.price}$</p>
                        <a href="#" class="btn btn-primary">Buy Now</a>
                        <a href="#" class="btn btn-primary">Add Cart</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

