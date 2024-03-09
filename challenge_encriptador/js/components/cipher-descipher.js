const d = document;

const cipherDescipher = (msg, id) => {
  const encryptionMap = {
    e: 'enter',
    i: 'imes',
    a: 'ai',
    o: 'ober',
    u: 'ufat',
  };

  const decryptionMap = {
    enter: 'e',
    imes: 'i',
    ai: 'a',
    ober: 'o',
    ufat: 'u',
  };

  const isEncrypting = id === 'cipher';

  const mapToApply = isEncrypting ? encryptionMap : decryptionMap;
  const regexToReplace = isEncrypting
    ? /[eioua]/g
    : /(enter|imes|ai|ober|ufat)/g;

  const resultMsg = msg.replace(regexToReplace, (match) => mapToApply[match]);

  const targetId = isEncrypting ? 'descipher' : 'cipher';
  d.getElementById(targetId).value = resultMsg;
};

export default cipherDescipher;
