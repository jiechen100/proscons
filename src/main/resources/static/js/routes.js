angular.module('NoteWrangler', [ 'ngRoute' ]).config(
		[ '$routeProvider', function($routeProvider) {
			$routeProvider.when('/notes', {
				templateUrl : 'templates/pages/notes/index.html',
				controllerAs : 'notesIndexController',
				controller : 'NotesIndexController'
			}).when('/users', {
				templateUrl : 'templates/pages/users/index.html'
			}).when('/notes/new', {
				templateUrl : 'templates/pages/notes/edit.html'
			}).when('/notes/:id', {
				templateUrl : 'templates/pages/notes/show.html',
				controllerAs : 'notesShowController',
				controller : 'NotesShowController'
			}).when('/', {
				redirectTo : '/users'
			}).otherwise({
				redirectTo : '/notes'
			});

		} ]);