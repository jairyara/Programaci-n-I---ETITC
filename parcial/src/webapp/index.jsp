<!-- /**
* Proyecto Escaneate - Landing page
* Parcial tercer corte Programación I
* @author Edinson Jair Yara Rueda / Miguel David Ruiz Sanchez S2D
* @date 3/12/2020
* @version 0.1
**/ -->

<%@ page import="escaneate.com.registro.*" %>
<%@ page import="static escaneate.com.registro.Main.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tus datos en todo momento - Escanéate</title>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Dosis&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.12.1/css/all.css">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<article class="main">
    <header class="header">
        <a href="" class="header__logo">
            <img src="https://github.com/Mdrssog/Escaneate-page/blob/master/src/assets/images/logo.png?raw=true"
                 class="header__logo--img" alt="Logo Escaneate">
            <p class="header__logo--name">Escaneate</p>
        </a>
        <nav class="header__menu">
            <ul>
                <li><a href="/escaneate_war_exploded/index.jsp">Registra</a></li>
                <li><a href="/escaneate_war_exploded/about.jsp">Acerca de</a></li>
            </ul>
        </nav>
    </header>
    <aside class="data">
        <form method="POST" action="" class="data__form">
            <label for="name">Nombres y apellidos</label>
            <input id="name" name="name" type="text" autocomplete="off" onkeyup="updatePreview()">
            <label for="typeDNI">Tipo de documento</label>
            <select name="typeDNI" id="typeDNI" onchange="updatePreview()">
                <option value="select" selected disabled>Seleccione una opción</option>
                <option value="Cedula">Cédula</option>
                <option value="Tarjeta de indentidad">Tarjeta de identidad</option>
                <option value="Cedula de extranjeria">Cédula extranjería</option>
            </select>
            <label for="DNI">Numero de documento</label>
            <input name="DNI" id="DNI" type="number" autocomplete="off" onkeyup="updatePreview()">
            <label for="phone">Teléfono</label>
            <input name="phone" type="number" id="phone" autocomplete="off" onkeyup="updatePreview()">
            <label for="birth">Fecha de nacimiento</label>
            <input name="birth" min="1950-01-01" type="date" id="birth" autocomplete="off" onchange="updatePreview()">
            <label for="contact">En caso de emergencia llamar a:</label>
            <input name="contact" type="text" id="contact" autocomplete="off" onkeyup="updatePreview()">
            <label for="parent">Parentesco</label>
            <select name="parent" id="parent" onchange="updatePreview()">
                <option value="select" selected disabled>Seleccione una opción</option>
                <option value="Madre / Padre">Madre / padre</option>
                <option value="Tia / Tio">Tía / tío</option>
                <option value="Hermana / Hermano">Hermano</option>
                <option value="Esposa / Esposo">Esposa / esposo</option>
            </select>
            <label for="blood">Grupo sanguíneo</label>
            <select name="blood" id="blood" onchange="updatePreview()">
                <option value="select" selected disabled>Seleccione una opción</option>
                <option value="A">A</option>
                <option value="B">B</option>
                <option value="AB">AB</option>
                <option value="O">O</option>
            </select>
            <label for="rh">RH</label>
            <select name="rh" id="rh" onchange="updatePreview()">
                <option value="select" selected disabled>Seleccione una opción</option>
                <option value="+">Positivo</option>
                <option value="-">Negativo</option>
            </select>
            <label for="genre">Género</label>
            <select name="genre" id="genre" onchange="updatePreview()">
                <option value="select" selected disabled>Seleccione una opción</option>
                <option value="Femenino">Femenino</option>
                <option value="Masculino">Masculino</option>
            </select>
            <label for="patology">Patologías</label>
            <input name="patology" id="patology" type="text" autocomplete="off" onkeyup="updatePreview()">
            <button type="submit">Guardar</button>
        </form>
    </aside>

    <section class="view">

        <!-- Capturando los datos mediante los métodos creados en la clase Main -->
        <% Main.obtenerNombre(request.getParameter("name"));%>
        <% Main.obtenerTipoDNI(request.getParameter("typeDNI"));%>
        <% Main.obtenerDNI(Long.parseLong(request.getParameter("DNI") == null ? "0" : request.getParameter("DNI")));%>
        <% Main.obtenerTel(Long.parseLong(request.getParameter("phone") == null ? "0" : request.getParameter("phone")));%>
        <% Main.obtenerFnac(request.getParameter("birth"));%>
        <% Main.obtenerContacto(request.getParameter("contact"));%>
        <% Main.obtenerParent(request.getParameter("parent"));%>
        <% Main.obtenerSang(request.getParameter("blood"));%>
        <% Main.obtenerRH(request.getParameter("rh"));%>
        <% Main.obtenerGenero(request.getParameter("genre"));%>
        <% Main.obtenerPatol(request.getParameter("patology"));%>

        <div class="view__prev">
            <h3> Vista previa</h3>
            <div>
                <h6>Nombre: &nbsp; </h6>
                <p id="preview-name"></p>
            </div>
            <div>
                <h6>Tipo de documento: &nbsp; </h6>
                <p id="preview-typeDNI"></p>
            </div>
            <div>
                <h6>Número de documento: &nbsp;</h6>
                <p id="preview-DNI"></p>
            </div>
            <div>
                <h6>Número teléfonico: &nbsp;</h6>
                <p id="preview-phone"></p>
            </div>
            <div>
                <h6>Fecha de nacimiento: &nbsp;</h6>
                <p id="preview-birth"></p>
            </div>
            <div>
                <h6>Contacto de emergencia: &nbsp; </h6>
                <p id="preview-contact"></p>
            </div>
            <div>
                <h6>Parentesco: &nbsp;</h6>
                <p id="preview-parent"></p>
            </div>
            <div>
                <h6>Grupo sanguineo y RH: &nbsp;</h6>
                <p id="preview-gs"></p>
                <p>&nbsp;</p>
                <p id="preview-rh"></p>
            </div>
            <div>
                <h6>Género: &nbsp;</h6>
                <p id="preview-genre"></p>
            </div>
            <div>
                <h6>Patología: &nbsp;</h6>
                <p id="preview-patology"></p>
            </div>

        </div>

        <div class="view__fin">

            <h3> Datos guardados</h3>
            <!---Recorremos el arraylist para ver los datos en el navegador -->
            <% if (!(nombre == null || nombre == "")) { %>
            <% usuario.add(new Usuario(nombre, tipoDNI, DNI, phone, birth, contact, parent, blood, rh, genre, patology)); %>

            <% for (Usuario x : usuario) { %>
            <div>

                <p>Nombre: <%= x.getNombre() %>
                </p>
                <p>Tipo de documento: <%= x.getTypeDNI() %>
                </p>
                <p>Número de documento: <%= x.getDNI() %>
                </p>
                <p>Número telefónico: <%= x.getPhone() %>
                </p>
                <p>Fecha de nacimiento: <%= x.getBirth() %>
                </p>
                <p>Contacto de emergencia: <%= x.getContact() %>
                </p>
                <p>Parentesco: <%= x.getParent() %>
                </p>
                <p>GS y RH: <%= x.getBlood() %>  <%= x.getRh()%>
                </p>
                <p>Género: <%= x.getGenre() %>
                </p>
                <p>Patologías: <%= x.getPatology() %>
                </p>

            </div>
            <%
                }
            %>
            <%
                }
            %>

        </div>
    </section>
</article>

<script>
    function updatePreview() {
        let name = document.getElementById("preview-name");
        let typeDNI = document.getElementById("preview-typeDNI");
        let dni = document.getElementById("preview-DNI");
        let phone = document.getElementById("preview-phone");
        let birth = document.getElementById("preview-birth");
        let contact = document.getElementById("preview-contact");
        let parent = document.getElementById("preview-parent");
        let blood = document.getElementById("preview-gs");
        let rh = document.getElementById("preview-rh");
        let genre = document.getElementById("preview-genre");
        let patology = document.getElementById("preview-patology");

        let fieldName = document.getElementById("name");
        let fieldTypeDNI = document.getElementById("typeDNI");
        let fieldDNI = document.getElementById("DNI");
        let fieldPhone = document.getElementById("phone");
        let fieldBirth = document.getElementById("birth");
        let fieldContact = document.getElementById("contact");
        let fieldParent = document.getElementById("parent");
        let fieldBlood = document.getElementById("blood");
        let fieldRh = document.getElementById("rh");
        let fieldGenre = document.getElementById("genre");
        let fieldPatology = document.getElementById("patology");

        name.innerHTML = fieldName.value;
        typeDNI.innerHTML = fieldTypeDNI.options[fieldTypeDNI.selectedIndex].text;
        dni.innerHTML = fieldDNI.value;
        phone.innerHTML = fieldPhone.value;
        birth.innerHTML = fieldBirth.value;
        contact.innerHTML = fieldContact.value;
        parent.innerHTML = fieldParent.options[fieldParent.selectedIndex].text;
        blood.innerHTML = fieldBlood.options[fieldBlood.selectedIndex].text;
        rh.innerHTML = fieldRh.options[fieldRh.selectedIndex].text;
        genre.innerHTML = fieldGenre.options[fieldGenre.selectedIndex].text;
        patology.innerHTML = fieldPatology.value;
    }
</script>

</body>
</html>