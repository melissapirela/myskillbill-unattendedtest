var billCtrl = angular.module('loginController', []);

billCtrl.controller('LoginController', '$scope',
	function ($scope) {
		$scope.logButton = 'Log Out';
		$scope.logUser = 'Melissa';
	});