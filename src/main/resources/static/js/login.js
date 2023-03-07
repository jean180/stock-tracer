function tratarVisibilidadCards(buttonId) {
  //Variables
  var showLoginButton = $("#showLoginButton");
  var showRegisterButton = $("#showRegisterButton");
  var registerAlert = $("#registerAlert");

  if (buttonId == 'showLoginButton') {
    showRegisterButton.removeClass("d-none");
    showLoginButton.addClass("d-none");
  }

  if (buttonId == 'showRegisterButton') {
    showLoginButton.removeClass("d-none");
    showRegisterButton.addClass("d-none");
  }
  moveDiv(buttonId);

  $("#registerForm").submit(function (event) {
    var password = $("#password");
    var confirmPassword = $("#confirmPassword");
    var userAlreadyExist = $("#userAlreadyExist-alert");

    if (password.val() != confirmPassword.val()) {
      registerAlert.removeClass("d-none");
      userAlreadyExist.addClass("d-none");

      event.preventDefault();
    }
  });
}

function moveDiv(buttonId) {
  var button = $('#' + buttonId).parent();
  var bodyWidth = $('body').width();
  var buttonWidth = button.width();
  var leftPosition = button.position().left;
  var newPosition = leftPosition < bodyWidth / 2 ? bodyWidth - buttonWidth : 0;

  button.animate({ left: newPosition }, "slow");
}