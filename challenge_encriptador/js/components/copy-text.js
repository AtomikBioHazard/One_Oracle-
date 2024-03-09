const d = document;

const copyText = () => {
  const textToCopy = d.getElementById('descipher').value;

  if (!textToCopy) {
    Swal.fire({
      icon: 'info',
      title: 'Nada para copiar',
      text: 'Primero debes ingresar algo de texto',
      confirmButtonText: 'Entendido',
    });

    return;
  }

  navigator.clipboard
    .writeText(textToCopy)
    .then(() => {
      Swal.fire({
        icon: 'success',
        title: 'Copiado!',
        timer: 1500,
      });
    })
    .catch((err) => {
      Swal.fire({
        icon: 'error',
        title: 'Oops... Algo salió mal',
        html: `Error: ${err}`,
        confirmButtonText: 'Entendido',
      });
    });
};

export default copyText;

d.getElementById('copyTxt').addEventListener('click', copyText);

