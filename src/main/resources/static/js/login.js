$(document).ready(function(){
  $("#registerForm").submit(function (event) {
    var password = $("#password");
    var confirmPassword = $("#confirmPassword");
    var userAlreadyExist = $("#userAlreadyExist-alert");
    var registerAlert = $("#registerAlert");

    if (password.val() != confirmPassword.val()) {
      registerAlert.removeClass("d-none");
      userAlreadyExist.addClass("d-none");
  
      event.preventDefault();
    }
  });
});
function tratarVisibilidadCards(buttonId) {
  //Variables
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

  deshabilitarBotones();
  moveDiv(buttonId);

  
}

function moveDiv(buttonId) {
  var button = $('#' + buttonId).parent();
  var bodyWidth = $('body').width();
  var buttonWidth = button.width();
  var leftPosition = button.position().left;
  var newPosition = leftPosition < bodyWidth / 2 ? bodyWidth - buttonWidth : 0;

  button.animate({ left: newPosition }, {
    duration: "slow", complete: function () {
      habilitarBotones();
    }
  });
}

function deshabilitarBotones() {
  $("#showLoginButton").addClass("disabled");
  $("#showRegisterButton").addClass("disabled");
}

function habilitarBotones() {
  $("#showLoginButton").removeClass("disabled");
  $("#showRegisterButton").removeClass("disabled");
}