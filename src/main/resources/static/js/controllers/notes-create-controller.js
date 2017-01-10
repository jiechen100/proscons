angular.module('NoteWrangler').controller('NoteCreateController',
		function($http) {
			var controller = this;
			controller.errors = null;
			this.saveNote = function(note) {
				$http({
					method : POST,
					url : '/notes',
					data : note
				}).cache(function(note) {
					controller.errors = note.data.error;
				})
			};
		});