require([ 'jquery', 'jquery.ui', ], function() {
	var action = 'restSample';
	$.ajax({
		url : action,
		type : 'POST',
		success : function(data, dataType) {
			$('#message_POST').text(data);
		}
	});
	$.ajax({
		url : action,
		type : 'GET',
		success : function(data, dataType) {
			$('#message_GET').text(data);
		}
	});
	$.ajax({
		url : action,
		type : 'PUT',
		success : function(data, dataType) {
			$('#message_PUT').text(data);
		}
	});
	$.ajax({
		url : action,
		type : 'DELETE',
		success : function(data, dataType) {
			$('#message_DELETE').text(data);
		}
	});
});