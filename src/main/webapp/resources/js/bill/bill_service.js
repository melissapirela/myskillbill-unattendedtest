angular.module('MySkyApp.bill')
	.factory('BillService', function($http) {

		return {
			getBill: function() {
				var obj = { content:null };

			    $http.get('bill/bill.json')
			    	.success(function(data) {
				        obj.content = data;
				    })
				    .error(function() {
				    	obj.content = null;
				    });    

			    return obj;
			}
		}
	        
	});