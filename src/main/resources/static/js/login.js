var showLogin = true;
var showRegister = false;
window.onload = function() {
  
  tratarVisibilidadCards();

}

function tratarVisibilidadCards(){
  var loginCard = document.getElementById("loginCard");
  var registerCard = document.getElementById("registerCard");

  if (showLogin == true) {
    loginCard.classList.remove("invisible");
  } else {
    loginCard.classList.add("invisible");
  }

  if (showRegister == true) {
    registerCard.classList.remove("invisible");
  } else {
    registerCard.classList.add("invisible");
  }
}

function pruebaVisib(){
  if (showLogin == true) {
    showLogin = false;
  } else {
    showLogin = true;
  }
  
  if (showRegister == true) {
    showRegister = false;
  } else {
    showRegister = true;
  }

  tratarVisibilidadCards();
}