angular.module('MySkyApp.bill', [
	'ngRoute'
])
.config(['$routeProvider', function($routeProvider) {
	$routeProvider.when('/bill', {
        templateUrl: 'layout',
        controller: 'BillController'
	});
}]);
