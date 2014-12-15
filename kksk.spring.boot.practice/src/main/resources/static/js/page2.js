require([ 'jquery', 'jquery.ui', ], function() {
	$('#message').text('page 2!');
	$('#button').button().on('click', function() {
		location.href = 'p1';
	});
});