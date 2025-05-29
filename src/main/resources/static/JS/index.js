document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector("form");

    form.addEventListener("submit", function (e) {
        const username = form.username.value.trim();
        const password = form.password.value.trim();

        if (username === "" || password === "") {
            e.preventDefault(); // Impede envio
            alert("Por favor, preencha todos os campos.");
        }
    });
});
