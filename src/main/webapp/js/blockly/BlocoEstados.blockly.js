window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.BlocoEstados = window.blockly.js.blockly.BlocoEstados
		|| {};

var item;

/**
 * BlocoEstados
 */
window.blockly.js.blockly.BlocoEstados.Executar = function() {
	item = this.cronapi.screen.getValueOfField("Estado.active.id");
	this.cronapi.screen.notify('success', item);
}
