var app = angular.module('MySkyBillApp', ['ngRoute', 'billController']);

app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
    	.when('/bill', {
	        templateUrl: 'bill/layout',
	        controller: 'BillController'
    	});
}]);