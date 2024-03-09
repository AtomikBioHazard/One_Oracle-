import copyText from "./components/copy-text.js";
import patternValidation from "./components/pattern-validation.js";
import welcomeMsg from "./components/welcome-msg.js";

const d = document;

d.addEventListener('DOMContentLoaded', () => {
  welcomeMsg();

  d.getElementById('cipher').placeholder = 'Escribe aqui tu mensaje';
  d.getElementById('descipher').placeholder =
    'Escrimesbenter aiqufatimes tufat menternsaijenter';
  
  patternValidation();
});



