// Navegação para Detalhes
function showTaskDetails(taskId) {
    // Implementar lógica para buscar dados da tarefa
    window.location.href = `task-details.html?id=${taskId}`;
}

// Controle de Edição (Exemplo)
$(document).ready(function() {
    $('.edit-btn').click(function() {
        $(this).closest('.task-details-container').find('input, select').prop('disabled', false);
    });
});