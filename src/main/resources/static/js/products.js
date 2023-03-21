var idProcuts = [];
function addRemoveProduct(productId) {
    var plusIcon = $("#plusIcon-" + productId);
    var minusIcon = $("#minusIcon-" + productId);
    if (idProcuts.indexOf(productId) === -1) {
        //Si el producto no está en la lista lo agregamos
        idProcuts.push(productId);
        plusIcon.addClass("d-none");
        minusIcon.removeClass("d-none");
    } else {
        //Si el producto está en la lista, lo eliminamos
        const index = idProcuts.findIndex(num => num ===productId);
        idProcuts.splice(index, 1);
        minusIcon.addClass("d-none");
        plusIcon.removeClass("d-none");
    }
}