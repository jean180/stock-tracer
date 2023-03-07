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