const d = document;

const welcomeMsg = () => {
  const msg = `
    <div class="welcome-msg">
      <p class="instructions">Instrucciones:</p>
      <ul>
        <li>1. La app funciona automáticamente para cifrar o descifrar</li>
        <li>2. Solo ingresa el texto en la caja correspondiente</li>
        <li>3. NO utilices mayúsculas, acentos, ni caracteres especiales</li>
      </ul>
      <span>Puedes copiar tu texto cifrado, con el botón de abajo</span>
    </div>
  `;

  Swal.fire({
    title: 'Bienvenido al Encriptador',
    html: msg,
    icon: 'info',
    confirmButton: 'Entendido',
  });
};

export default welcomeMsg;
