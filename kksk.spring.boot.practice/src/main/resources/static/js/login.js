require([ 'jquery', 'jquery.ui', ], function() {
	$('#button').button().on('click', function() {
		$.ajax({
			url : 'login',
			data : {
				name : $('#name').val(),
				password : $('#password').val()
			},
			type : 'POST',
			success : function(data, dataType) {
				$('#message').text('Login result:' + data + '!!!');
			}
		});
	});
});