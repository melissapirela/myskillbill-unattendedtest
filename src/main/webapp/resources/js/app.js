angular.module('MySkyApp', [
	'ngRoute', 
	'MySkyApp.bill'
])
.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
    	.otherwise({
    		redirectTo: '/bill'
    	});
}]);