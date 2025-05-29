function filtrar(tipo) {
    const tarefas = document.querySelectorAll(".item-tarefa");
    tarefas.forEach(tarefa => {
        const status = tarefa.dataset.status;
        if (tipo === "todas" || status === tipo) {
            tarefa.style.display = "flex";
        } else {
            tarefa.style.display = "none";
        }
    });
}
// Controle do Menu Lateral
document.addEventListener('DOMContentLoaded', function() {
    const menuBtn = document.getElementById('menuBtn');
    const sidebar = document.getElementById('sidebar');
    
    // Criar overlay dinamicamente
    const overlay = document.createElement('div');
    overlay.className = 'overlay';
    document.body.appendChild(overlay);

    // Alternar menu
    if (menuBtn && sidebar) {
        menuBtn.addEventListener('click', function(e) {
            e.stopPropagation();
            sidebar.classList.toggle('active');
            overlay.style.display = sidebar.classList.contains('active') ? 'block' : 'none';
        });

        // Fechar menu ao clicar fora
        overlay.addEventListener('click', function() {
            sidebar.classList.remove('active');
            overlay.style.display = 'none';
        });
    }

    // Fechar menu ao clicar em um link (opcional)
    document.querySelectorAll('.sidebar a').forEach(link => {
        link.addEventListener('click', () => {
            sidebar.classList.remove('active');
            overlay.style.display = 'none';
        });
    });
});




