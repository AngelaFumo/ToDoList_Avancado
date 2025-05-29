document.addEventListener("DOMContentLoaded", function () {
    const form = document.querySelector("#registerForm");

    form.addEventListener("submit", function (e) {
        const username = form.username.value.trim();
        const email = form.email.value.trim();
        const password = form.password.value.trim();
        const confirmPassword = form.confirmPassword.value.trim();

        if (!username || !email || !password || !confirmPassword) {
            e.preventDefault();
            alert("Por favor, preencha todos os campos.");
            return;
        }

        if (password !== confirmPassword) {
            e.preventDefault();
            alert("As senhas não coincidem.");
        }
    });
});
