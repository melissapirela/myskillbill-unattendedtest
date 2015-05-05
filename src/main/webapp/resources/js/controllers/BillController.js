var billCtrl = angular.module('billController', ['billService']);

billCtrl.controller('BillController', 
	function ($scope, BillService) {
		$scope.skybill = BillService.content;
		$scope.client = {name: "Melissa Pirela", address:"No.2 Wellington Place, LS1 4AP, Leeds", telephone:"07544895632"}; 
	});