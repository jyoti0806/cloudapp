/* global QUnit */
QUnit.config.autostart = false;

sap.ui.getCore().attachInit(function () {
	"use strict";

	sap.ui.require([
		"cld/com/cldjy/test/unit/AllTests"
	], function () {
		QUnit.start();
	});
});