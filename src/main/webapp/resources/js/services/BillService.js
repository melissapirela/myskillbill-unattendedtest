var billSrv = angular.module('billService', []);

billSrv.factory("BillService", function($http) {
   var obj = { content:null };

    $http.get('bill/bill.json')
    	.success(function(data) {
	        obj.content = data;
	    })
	    .error(function() {
	    	obj.content = null;
	    });    

    return obj;    
});