import cipherDescipher from './cipher-descipher.js';

const d = document;
const pattern = /^[a-zñ\s!¿?]*$/;

const handleKeyUp = (id) => {
  return () => {
    const msgArea = d.getElementById(id);
    let msg = msgArea.value;

    if (!pattern.test(msg)) {
      Swal.fire({
        title: 'Error',
        text: 'Ingresaste un caracter inválido',
        icon: 'error',
        confirmButton: 'Aceptar',
      });

      msgArea.value = msg.slice(0, -1);
      return;
    }

    cipherDescipher(msg, id);
  };
};

const patternValidation = () => {
  d.getElementById('cipher').addEventListener('keyup', handleKeyUp('cipher'));

  d.getElementById('descipher').addEventListener(
    'keyup',
    handleKeyUp('descipher')
  );
};

export default patternValidation;
