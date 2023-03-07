$(document).ready(function() {
  //Recogemos el parámetro de error en caso de haberlo
  var registerError = document.querySelector('[registerError]').getAttribute('registerError');
  var registerAlert = $("#register-alert");
  var userAlredyExistError = $("#userAlredyExistError");
  
  if(registerError!=null){
    console.log(registerError);
    registerAlert.removeClass("d-none");
    userAlredyExistError.removeClass("d-none");
  }

  //Metodo para validar que los dos campos de la contraseña son iguales
  var registerForm = document.getElementById("registerForm");
  registerForm.addEventListener('submit', (event) => {
    var password = $("#password");
    var confirmPassword = $("#confirmPassword");
    var registerAlert = $("#register-alert");
    var passwordError = $("#passwordError");
  
    if (password!=confirmPassword) {
      // La condición se cumple, cancelamos el envío del formulario
      registerAlert.removeClass("d-none");
      passwordError.removeClass("d-none");
      event.preventDefault();
    }
  });

});

function tratarVisibilidadCards(buttonId) {
  var showLoginButton = $("#showLoginButton");
  var showRegisterButton = $("#showRegisterButton");
  
  if (buttonId == 'showLoginButton') {
    showRegisterButton.removeClass("d-none");
    showLoginButton.addClass("d-none");
  }
  
  if (buttonId == 'showRegisterButton') {
    showLoginButton.removeClass("d-none");
    showRegisterButton.addClass("d-none");
  }
  moveDiv(buttonId)
}

function moveDiv(buttonId) {
  var button = $('#' + buttonId).parent();
  var bodyWidth = $('body').width();
  var buttonWidth = button.width();
  var leftPosition = button.position().left;
  var newPosition = leftPosition < bodyWidth / 2 ? bodyWidth - buttonWidth : 0;
  
  button.animate({ left: newPosition }, "slow");
}