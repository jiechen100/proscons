angular.module('NoteWrangler').controller('NotesEditController',
		function($http) {
			var controller = this;
			$http({
				method : 'GET',
				url : '/notes/edit'
			}).success(function(data) {
				controller.notes = data;
			});
		});