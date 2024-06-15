<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>LeopardWear</title>
    <%@include file="includes/header.jsp" %>

</head>
<body>

<div class="colorlib-loader"></div>

<div id="page">
    <%@include file="includes/nvabar.jsp" %>

    <div class="breadcrumbs">
        <div class="container">
            <div class="row">
                <div class="col">
                    <p class="bread"><span><a href="/">Home</a></span> / <span>Product Details</span></p>
                </div>
            </div>
        </div>
    </div>

    <div class="colorlib-product">
        <div class="container">
            <div class="row row-pb-lg product-detail-wrap">
                <div class="col-sm-8">
                    <div class="owl-carousel">
                        <c:if test="${empty imagesShoeDetail}">
                         <p>No images</p>
                        </c:if>
                        <c:forEach var="img" items="${imagesShoeDetail}">
                            <div class="item">
                                <div class="product-entry border">
                                    <a href="#" class="prod-img">
                                        <img src="/images/${img.url}" class="img-fluid" alt="ShoeDetai Image">
                                    </a>
                                </div>
                            </div>
                        </c:forEach>

                    </div>
                </div>
                <div class="col-sm-4">
                    <div class="product-desc">
                        <h3>${shoeDetail.name}</h3>
                        <p class="price">
                            <span>$${shoeDetail.price}</span>
                            <span class="rate">
									<i class="icon-star-full"></i>
									<i class="icon-star-full"></i>
									<i class="icon-star-full"></i>
									<i class="icon-star-full"></i>
									<i class="icon-star-half"></i>
									(74 Rating)
								</span>
                        </p>
                        <p>${shoeDetail.description}</p>
                        <div class="size-wrap">
                            <div class="block-26 mb-2">
                                <h4>Size</h4>
                                <ul>
                                    <c:forEach var="size" items="${sizes}">
                                        <li><a href="#">${size.name}</a></li>
                                    </c:forEach>
                                </ul>
                            </div>
                            <div class="block-26 mb-4">
                                <h4>Width</h4>
                                <ul>
                                    <li><a href="#">M</a></li>
                                    <li><a href="#">W</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="input-group mb-4">
                     	<span class="input-group-btn">
                        	<button type="button" class="quantity-left-minus btn" data-type="minus" data-field="">
                           <i class="icon-minus2"></i>
                        	</button>
                    		</span>
                            <input type="text" id="quantity" name="quantity" class="form-control input-number" value="1"
                                   min="1" max="100">
                            <span class="input-group-btn ml-1">
                        	<button type="button" class="quantity-right-plus btn" data-type="plus" data-field="">
                             <i class="icon-plus2"></i>
                         </button>
                     	</span>
                        </div>
                        <div class="row">
                            <div class="col-sm-12 text-center">
                                <p class="addtocart"><a href="cart.html" class="btn btn-primary btn-addtocart"><i
                                        class="icon-shopping-cart"></i> Add to Cart</a></p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


        </div>
    </div>

    <%@include file="includes/footer.jsp" %>
</body>
</html>

