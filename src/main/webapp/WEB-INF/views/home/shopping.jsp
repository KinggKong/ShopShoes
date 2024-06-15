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
                    <p class="bread"><span><a href="/">Home</a></span> / <span>Shopping</span></p>
                </div>
            </div>
        </div>
    </div>

    <div class="breadcrumbs-two">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="breadcrumbs-img"
                         style="background-image: url(http://localhost:8080/images/cover-img-1.jpg);">

                    </div>
                    <div class="menu text-center">
                        <p><a href="#">New Arrivals</a> <a href="#">Best Sellers</a> <a href="#">Extended Widths</a> <a
                                href="#">Sale</a></p>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div class="colorlib-featured">
        <div class="container">
            <div class="row">
                <div class="col-sm-4 text-center">
                    <div class="featured">
                        <div class="featured-img featured-img-2"
                             style="background-image: url(http://localhost:8080/images/img_bg_2.jpg);">
                            <h2>Casuals</h2>
                            <p><a href="#" class="btn btn-primary btn-lg">Shop now</a></p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 text-center">
                    <div class="featured">
                        <div class="featured-img featured-img-2"
                             style="background-image: url(http://localhost:8080/images/women.jpg);">
                            <h2>Dress</h2>
                            <p><a href="#" class="btn btn-primary btn-lg">Shop now</a></p>
                        </div>
                    </div>
                </div>
                <div class="col-sm-4 text-center">
                    <div class="featured">
                        <div class="featured-img featured-img-2"
                             style="background-image: url(http://localhost:8080/images/item-11.jpg);">
                            <h2>Sports</h2>
                            <p><a href="#" class="btn btn-primary btn-lg">Shop now</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="colorlib-product">
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-xl-3">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="side border mb-1">
                                <h3>Brand</h3>
                                <ul>
                                    <c:forEach items="${brands}" var="brand">
                                        <li><a href="#">${brand.name}</a></li>
                                    </c:forEach>
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-12">
                            <div class="side border mb-1">
                                <h3>Size</h3>
                                <div class="block-26 mb-2">
                                    <%--                                    <h4>Size</h4>--%>
                                    <ul>
                                        <c:forEach items="${sizes}" var="size">
                                            <li><a href="#">${size.name}</a></li>
                                        </c:forEach>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-12">
                            <div class="side border mb-1">
                                <h3>Style</h3>
                                <ul>
                                    <li><a href="#">Slip Ons</a></li>
                                    <li><a href="#">Boots</a></li>
                                    <li><a href="#">Sandals</a></li>
                                    <li><a href="#">Lace Ups</a></li>
                                    <li><a href="#">Oxfords</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-12">
                            <div class="side border mb-1">
                                <h3>Colors</h3>
                                <ul>
                                    <c:forEach items="${colors}" var="color">
                                        <li><a href="#">${color.name}</a></li>
                                    </c:forEach>
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-12">
                            <div class="side border mb-1">
                                <h3>Material</h3>
                                <ul>
                                    <li><a href="#">Leather</a></li>
                                    <li><a href="#">Suede</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-12">
                            <div class="side border mb-1">
                                <h3>Technologies</h3>
                                <ul>
                                    <li><a href="#">BioBevel</a></li>
                                    <li><a href="#">Groove</a></li>
                                    <li><a href="#">FlexBevel</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-lg-9 col-xl-9">
                    <div class="row row-pb-md">
                        <c:forEach items="${page.content}" var="p">
                            <div class="col-lg-4 mb-4 text-center">
                                <div class="product-entry border">
                                    <a href="/shoes/${p.id}" class="prod-img">
                                        <img src="/images/${p.thumbnailURL}" class="img-fluid"
                                             alt="Free html5 bootstrap 4 template">
                                    </a>
                                    <div class="desc">
                                        <h2><a href="/shoes/${p.id}">${p.name}</a></h2>
                                        <span class="price">${p.price}$</span>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <div class="row">
                        <div class="col-md-12 text-center">
                            <div class="block-27">
                                <ul>
                                    <li><a href="#"><i class="ion-ios-arrow-back"></i></a></li>
                                    <c:forEach begin="1" end="${totalPage}" var="page">
                                        <li class=""><span>${page}</span></li>
                                    </c:forEach>
                                    <li><a href="#"><i class="ion-ios-arrow-forward"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <%@include file="includes/trustPartner.jsp" %>

</div>
<%@include file="includes/footer.jsp" %>
</body>
</html>

