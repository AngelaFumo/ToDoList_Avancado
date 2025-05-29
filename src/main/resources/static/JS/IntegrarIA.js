const form = document.getElementById("form");
const input = document.getElementById("user-input");
const chatBox = document.getElementById("chat-box");

form.addEventListener("submit", function (e) {
  e.preventDefault();

  const userText = input.value.trim();
  if (!userText) return;

  addMessage("user", userText);
  input.value = "";

  // Simular resposta da IA
  setTimeout(() => {
    const response = generateFakeResponse(userText);
    addMessage("bot", response);
  }, 1000);
});

function addMessage(sender, text) {
  const msg = document.createElement("div");
  msg.className = `msg ${sender}`;
  msg.innerText = text;
  chatBox.appendChild(msg);
  chatBox.scrollTop = chatBox.scrollHeight;
}

function generateFakeResponse(input) {
  // Resposta simulada
  const respostas = [
    "Claro! Vou verificar isso para você.",
    "Entendi. Já estou trabalhando nisso!",
    "Boa pergunta! A resposta é sim.",
    "Desculpe, não consegui entender bem. Pode reformular?",
  ];
  return respostas[Math.floor(Math.random() * respostas.length)];
}
