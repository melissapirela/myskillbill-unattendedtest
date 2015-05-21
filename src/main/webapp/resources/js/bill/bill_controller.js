angular.module('MySkyApp.bill')
	.controller('BillController',
		function ($scope, BillService) {
			$scope.skybill = BillService.getBill();
			$scope.client = {name: "Melissa Pirela", address:"No.2 Wellington Place, LS1 4AP, Leeds", telephone:"07544895632"}; 
		}
	);