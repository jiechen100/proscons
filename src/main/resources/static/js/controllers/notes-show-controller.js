angular.module('NoteWrangler').controller('NotesShowController',
		function($http, $routeParms) {
			var controller = this;
			$http({
				method : 'GET',
				url : '/notes/'+$routeParams.id
			}).success(function(data) {
				controller.note = data;
			});
		});