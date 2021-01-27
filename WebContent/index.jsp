<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Animal</title>

<!-- CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<link rel="stylesheet" href="css/cadastroAnimal.css">
</head>
<body>
    <!-- Menu superior-->
            <div id="header">
                <nav class="navbar navbar-expand-lg navbar-light  justify-content-between">
                    <div class="container-fluid">
                        <a class="navbar-brand" href="#">Página principal</a>
                        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                                <li class="nav-item">
                                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">Link</a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                        data-bs-toggle="dropdown" aria-expanded="false">
                                        Dropdown
                                    </a>
                                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                        <li><a class="dropdown-item" href="#">Action</a></li>
                                        <li><a class="dropdown-item" href="#">Another action</a></li>
                                        <li>
                                            <hr class="dropdown-divider">
                                        </li>
                                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                                    </ul>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                                </li>
                            </ul>
                            <form class="d-flex">
                                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                                <button class="btn btn-outline-success" type="submit">Search</button>
                            </form>
                        </div>
                    </div>
                </nav>
            </div>




    <main>
        <!-- Formulario Animal-->
        <form id="formulario-cadastro-animal" class="form-horizontal" action="animalControler" method="post">
            <div  class="container-fluid">
                

                <h1 id="titulo-formulario" class="fw-bold">Cadastro Animal</h1>

                <!--Nome-->
                <div class="input-group mb-3">
                    <input name="nome" type="text" class="form-control" placeholder="Nome" aria-label="Username"
                        aria-describedby="basic-addon1" required>
                </div>
                <!--/Nome-->

                <!--Tipo-->
                <div class="input-group mb-3">
                    <input name="tipo" type="text" class="form-control" placeholder="Tipo" aria-label="Username"
                        aria-describedby="basic-addon1" required>
                </div>
                <!--/Tipo-->

                <!--Raça-->
                <div class="input-group mb-3">
                    <input name="raca" type="text" class="form-control" placeholder="Raça" aria-label="Username"
                        aria-describedby="basic-addon1" required>
                </div>
                <!--/Raça-->

                <!--Idade-->
                <div class="input-group mb-3">
                    <input name="idade" type="number" class="form-control" placeholder="Idade" aria-label="Username"
                        aria-describedby="basic-addon1" required>
                </div>
                <!--/Idade-->

                <!-- Sexo -->
                <div name="sexo" id="sexoAnimal" class="control-group ">
                    <div class="controls">
                        <label class="radio">
                            <input type="radio" name="sexo" value="M">
                            Macho
                        </label>
                        <label class="radio">
                            <input type="radio" name="sexo" value="F">
                            Fêmea
                        </label>
                    </div>
                </div>
                <!--/Sexo -->

                <!--Descrição-->
                <div class="input-group">
                    <textarea name="descricao" class="form-control" aria-label="With textarea"
                        placeholder="Descreva o comportamento dele"></textarea>
                </div>
                <!--/Descrição-->

                <!--Imagem-->
                <div id="campo-imagem" class="file-field">
                    <div class="d-flex justify-content-center">
                      <div class="btn btn-mdb-color btn-rounded float-left">
                        <input id="imagem" name="imagem" class="input-file" type="file">
                      </div>
                    </div>
                  </div>
                 <!--/Imagem-->

                <!--Botão Enviar -->
                <div class="d-grid gap-2 col-8 mx-auto">
                    <label class="control-label"></label>
                    <div>
                        <button id="button-enviar" type="submit" name="enviar" class="btn btn-outline-primary btn-lg">Enviar</button>
                    </div>
                </div>
            </div>
        </form>
        
    </main>
    <footer>
        Roda-pé
    </footer>



    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <script src="js/cadastroanimal.js"></script>
</body>
</html>