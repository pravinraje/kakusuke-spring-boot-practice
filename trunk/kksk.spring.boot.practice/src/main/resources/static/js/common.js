var require = {
	shim : {
		'jquery' : {
			exports : '$'
		},
		'jquery.ui' : {
			deps : [ 'jquery' ]
		},
		'json2' : {
			exports : 'JSON'
		}
	},
	paths : {
		'jquery' : './lib/jquery/dist/jquery.min',
		'jquery.ui' : './lib/jquery-ui/jquery-ui.min',
		'json2' : './lib/json2.js'
	},
	urlArgs : 'bust=' + (new Date()).getTime()
};
