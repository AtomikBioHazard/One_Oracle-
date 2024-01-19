const d = document;
let numeroSecreto = 0;
let intentos = 0;
let listaNumerosSorteados = [];
let numeroMaximo = 10;

function asignarTextoElemento(elemento, txt) {
  const $elementoHTML = d.querySelector(elemento);
  $elementoHTML.innerHTML = txt;
}
function verificarIntento() {
  let numeroUsuario = parseInt(d.getElementById('valorUsuario').value);

  console.log(intentos);

  if (numeroUsuario === numeroSecreto) {
    asignarTextoElemento('p', `Acertaste el número! en ${intentos} ${intentos === 1 ? 'vez' : 'veces'}`);
    d.getElementById("reiniciar").removeAttribute('disabled');
  } else {
    // El usuario no acertó
    if (numeroUsuario > numeroSecreto) {
      asignarTextoElemento('p', 'El número secreto es menor');
    } else {
      asignarTextoElemento('p', 'El número secreto es mayor');
    };
    intentos++;
    limpiarCaja();
  };
};

function limpiarCaja() {
  d.querySelector('#valorUsuario').value = '';
}

function generarNumeroSectreto() {
  let numeroGenerado = (Math.floor(Math.random() * numeroMaximo) + 1);

  // Si ya sorteamos todos los números
  return listaNumerosSorteados.length == numeroMaximo
    ? asignarTextoElemento('p', `Ya se sortearon todos los números posibles`)
    :
      ( // Si el numero generado existe en la lista
      listaNumerosSorteados.includes(numeroGenerado)
        ? generarNumeroSectreto()
        : (listaNumerosSorteados.push(numeroGenerado), numeroGenerado));
}

function condicionesIniciales() {
  asignarTextoElemento('h1', 'Juego del Número Secreto');
  asignarTextoElemento('p', `Ingresa un número del 1 al ${numeroMaximo}`);
  numeroSecreto = generarNumeroSectreto();
  intentos = 1;
}

function reiniciarJuego() {
  // Limpiar la caja para iniciar nuevo
  limpiarCaja();

  // Indicar mensaje inicial
  condicionesIniciales();

  // Volver a deshabilitar boton de nuevo juego
  d.querySelector('#reiniciar').setAttribute('disabled', true);
}

condicionesIniciales();