<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"></jsp:include>
<div class="row">

    <!-- Area Chart -->
    <div class="col-xl-8 col-lg-7">
        <div class="card shadow mb-4">
            <!-- Card Header - Dropdown -->
            <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                <h6 class="m-0 font-weight-bold text-primary">LISTE DES PRODUITS</h6>

            </div>
            <!-- Card Body -->
            <div class="card-body">
                <table class="table">
                    <thead class="thead-dark">
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">NOM</th>
                        <th scope="col">QUANTITE</th>
                    </tr>
                    </thead>
                    <tbody>
                        
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <!-- Pie Chart -->
    <div class="col-xl-4 col-lg-5">
        <div class="card shadow mb-4">
            <!-- Card Header - Dropdown -->
            <div class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                <h6 class="m-0 font-weight-bold text-primary">Ajout Produit</h6>

            </div>
            <!-- Card Body -->
            <div class="card-body">
                <c:if test="${result == 1}">
                <div id="message" class="alert alert-success">Produit ajouté avec succees</div>
                </c:if>
                    <form method="post" action="Produit">
                        <div class="form-group">
                            <label>Nom Produit</label>
                            <input type="text" name="nom" class="form-control">
                        </div>

                        <div class="form-group">
                            <label>Quantite Produit</label>
                            <input type="text" name="qteStocks" class="form-control">
                        </div>
                        <div>
                            <input type="submit" value="Valider" class="btn btn-success">
                        </div>
                  </form>
            </div>
        </div>
    </div>
</div>
<script>
    $(document).ready(function () {
        $("message").show().fadeOut(1500).css("color","bleu")
    });
</script>
<jsp:include page="../footer.jsp"></jsp:include>