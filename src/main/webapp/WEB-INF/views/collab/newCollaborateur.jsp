<%@ page language ="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Nouveau Collaborateur</title>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.3.1-
dist/bootstrap-4.3.1-dist/css/bootstrap.css">
    </head>
    <body>
        <form method="post" action="">
            <fieldset>
            
                <legend>Nouveau Collaborateur</legend>
                
  <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="nom">Nom</label>  
                  <div class="col-md-4">
                    <input id="nom" name="nom" type="text" placeholder="" class="form-control input-md" required="">
                      
                  </div>
                </div>

  <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="prenom">Prénom</label>  
                  <div class="col-md-4">
                    <input id="prenom" name="prenom" type="text" placeholder="" class="form-control input-md" required="">
                      
                  </div>
                </div>

  <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="dateNaissance">Date de naissance</label>  
                  <div class="col-md-4">
                    <input id="dateNaissance" name="dateNaissance" type="date" placeholder="JJ/MM/AAAA" class="form-control input-md" required="">
                      
                  </div>
                </div>

  <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="adresse">Adresse</label>  
                  <div class="col-md-4">
                    <input id="adresse" name="adresse" type="text" placeholder="" class="form-control input-md" required="">
                      
                  </div>
                </div>

  <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="numeroSecu">numéro de sécurité sociale</label>  
                  <div class="col-md-4">
                    <input id="numeroSecu" name="numeroSecu" type="text" placeholder="" class="form-control input-md" maxlength = "15" required="">
                      
                  </div>
                </div>

  <!-- Button -->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="singlebutton"></label>
                  <div class="col-md-4">
                    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Créer</button>
                  </div>
                </div>

            </fieldset>
        </form>
</body>
</html>