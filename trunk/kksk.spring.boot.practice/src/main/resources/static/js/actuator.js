require([ 'json2', 'jquery', 'jquery.ui', ], function() {
	var actions = [ 'autoconfig', 'beans', 'configprops', 'dump', 'env',
			'health', 'info', 'metrics', 'mappings', 'shutdown', 'trace' ];
	var isPost = {
		'shutdown' : true
	};
	$.each(actions,
			function(idx, val) {
				$('#action').append(
						'<option value="' + val + '">' + val + '</option>');
			});
	$('#button').button().on('click', function() {
		var action = $('#action').val();
		$.ajax({
			url : action,
			type : (isPost[action] ? 'POST' : 'GET'),
			success : function(data, dataType) {
				$('#result').html('<pre>' + JSON.stringify(data, null, "    ") + '</pre>');
			}
		});
	});
});