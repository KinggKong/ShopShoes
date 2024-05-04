<%@ page language="java" pageEncoding="UTF-8" %>

<div class="container">
    <section class="py-5">
        <div class="container">
            <div class="row gx-5">
                <aside class="col-lg-6">
                    <div class="border rounded-4 mb-3 d-flex justify-content-center">
                        <a data-fslightbox="mygalley" class="rounded-4" target="_blank" data-type="image"
                           href="">
                            <img style="max-width: 100%; max-height: 100vh; margin: auto;" class="rounded-4 fit"
                                 src="/images/${item.image}"/>
                        </a>
                    </div>
                    <div class="d-flex justify-content-center mb-3">
                        <a data-fslightbox="mygalley" class="border mx-1 rounded-2" target="_blank"
                           data-type="image"
                           href=""
                           class="item-thumb">
                            <img width="60" height="60" class="rounded-2" src="/images/${item.image}"/>
                        </a>
                        <a data-fslightbox="mygalley" class="border mx-1 rounded-2" target="_blank"
                           data-type="image"
                           href=""
                           class="item-thumb">
                            <img width="60" height="60" class="rounded-2" src="/images/${item.image}"/>
                        </a>
                        <a data-fslightbox="mygalley" class="border mx-1 rounded-2" target="_blank"
                           data-type="image"
                           href=""
                           class="item-thumb">
                            <img width="60" height="60" class="rounded-2" src="/images/${item.image}"/>
                        </a>
                        <a data-fslightbox="mygalley" class="border mx-1 rounded-2" target="_blank"
                           data-type="image"
                           href=""
                           class="item-thumb">
                            <img width="60" height="60" class="rounded-2" src="/images/${item.image}"/>
                        </a>
                        <a data-fslightbox="mygalley" class="border mx-1 rounded-2" target="_blank"
                           data-type="image"
                           href=""
                           class="item-thumb">
                            <img width="60" height="60" class="rounded-2" src="/images/${item.image}"/>
                        </a>
                    </div>
                    <!-- thumbs-wrap.// -->
                    <!-- gallery-wrap .end// -->
                </aside>
                <main class="col-lg-6">
                    <div class="ps-lg-3">
                        <h4 class="title text-dark">
                           ${item.name}
                        </h4>
                        <div class="d-flex flex-row my-3">
                            <div class="text-warning mb-1 me-2">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fas fa-star-half-alt"></i>
                                <span class="ms-1">
                                            4.5 <i class="bi bi-star"></i>
                                        </span>
                            </div>
                            <span class="text-muted"><i class="fas fa-shopping-basket fa-sm mx-1"></i>${item.quantity}
                                        orders</span>
                            <span class="text-success ms-2">Trong Kho</span>
                        </div>

                        <div class="mb-3">
                            <span class="h5">${item.price}$</span>

                        </div>

                        <p>
                            CNES là một trong những cửa hàng sở hữu nhà máy đóng giày da nam cao cổ lớn nhất khu
                            vực Đông Nam Á, độc quyền đóng đế giày Goodyear tại Việt Nam. Dưới những đôi tay
                            lành nghề của nghệ nhân CNES, mỗi đôi giày cao cổ boot như một đứa con tinh thần mà
                            người thợ gửi gắm vào đó. Người tiêu dùng sẽ cảm nhận thật rõ sự êm ái, nhẹ nhàng từ
                            giày boot da nam CNES.
                        </p>

                        <div class="row">
                            <dt class="col-3">Loại:</dt>
                            <dd class="col-9">Thường</dd>

                            <dt class="col-3">Màu Sắc</dt>
                            <dd class="col-9">Nâu</dd>

                            <dt class="col-3">Chất Liệu</dt>
                            <dd class="col-9">Da Bê</dd>

                            <dt class="col-3">Thương Hiệu</dt>
                            <dd class="col-9">CNES</dd>
                        </div>

                        <hr/>

                        <div class="row mb-4">
                            <div class="col-md-4 col-6">
                                <label class="mb-2">Kích Thước</label>
                                <select class="form-select border border-secondary" style="height: 35px;">
                                    <option>Small</option>
                                    <option>Medium</option>
                                    <option>Large</option>
                                </select>
                            </div>
                            <!-- col.// -->
                            <div class="col-md-4 col-6 mb-3">
                                <label class="mb-2 d-block">Số Lượng</label>
                                <div class="input-group mb-3" style="width: 170px;">
                                    <button class="btn btn-white border border-secondary px-3" type="button"
                                            id="button-addon1" data-mdb-ripple-color="dark">
                                        <i class="bi bi-dash"></i>
                                    </button>
                                    <input type="text" class="form-control text-center border border-secondary"
                                           placeholder="14" aria-label="Example text with button addon"
                                           aria-describedby="button-addon1"/>
                                    <button class="btn btn-white border border-secondary px-3" type="button"
                                            id="button-addon2" data-mdb-ripple-color="dark">
                                        <i class="bi bi-plus"></i>
                                    </button>
                                </div>
                            </div>
                        </div>
                        <a href="#" class="btn btn-warning shadow-0"> Mua Ngay </a>
                        <a href="#" class="btn btn-primary shadow-0"> <i class="me-1 fa fa-shopping-basket"></i>
                            Thêm Vào Giỏ Hàng </a>
                    </div>
                </main>
            </div>
        </div>
    </section>
</div>