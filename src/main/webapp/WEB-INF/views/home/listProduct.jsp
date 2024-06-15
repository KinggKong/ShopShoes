<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="Css/product/listProduct.css">
<div class="container">
    <div class="row mt-4 justify-content-center">
        <c:forEach items="${page.content}" var="p">
            <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
                <div class="card" style="width: 18rem;">
                    <div class="card-details ">
                        <img src="/images/imgShoes/${p.thumbnailURL}" width="100%" height="200px" class="card-img-top"
                             alt="...">
                        <a href="#" style="text-decoration: none">
                            <p class="text-title">${p.name}</p>
                            <div>
                                <p class="text-title">${p.code}</p>
                            </div>

                        </a>
                        <p class="text-body">${p.price}$</p>
                    </div>
                    <button class="card-button">Add Cart</button>
                </div>
            </div>
        </c:forEach>
    </div>
</div>

