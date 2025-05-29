// Selecionar método de pagamento
const methods = document.querySelectorAll('.method');
methods.forEach(method => {
    method.addEventListener('click', () => {
        // Remover classe active de todos os métodos
        methods.forEach(m => m.classList.remove('active'));

        // Adicionar classe active ao método selecionado
        method.classList.add('active');

        // Esconder todos os detalhes de pagamento
        document.querySelectorAll('.payment-details').forEach(detail => {
            detail.style.display = 'none';
        });

        // Mostrar detalhes do método selecionado
        const methodType = method.getAttribute('data-method');
        document.getElementById(`${methodType}-details`).style.display = 'block';
    });
});

// Processar pagamento
function processPayment(method) {
    // Validar campos (simplificado para exemplo)
    let isValid = true;

    if (method === 'emola' || method === 'mpesa') {
        const phone = document.getElementById(`${method}-phone`).value;
        if (!phone || phone.length < 8) {
            isValid = false;
            alert('Por favor, insira um número de telefone válido');
        }
    }
