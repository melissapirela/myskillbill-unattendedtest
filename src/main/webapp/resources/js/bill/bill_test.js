'use strict';

describe('MySkyApp.bill module', function() {
	var $rootScope, $scope;
	var $controller, service;
	var BillService, $httpBackend;

	beforeEach(module('MySkyApp.bill'));

	describe('MySkyApp.bill controller', function() {
	    beforeEach(inject(function(_$rootScope_, _$controller_, _$q_, _BillService_) {
	        $rootScope = _$rootScope_;
	        $scope = $rootScope.$new();
	        $controller = _$controller_;
	        service = _BillService_;

	        $controller('BillController',
	            {'$scope': $scope, 'BillService': service});
	    }));

	    it('should be defined', function() {
	      	expect($controller).toBeDefined();
	      	expect($scope.skybill).toBeDefined();
	    });

  	});

  	describe('MySkyApp.bill service', function() {
		beforeEach(inject(function (_BillService_) {
		    BillService = _BillService_;
		}));

	    it('should be defined', function() {
	      	expect(BillService).toBeDefined();
	      	expect(BillService.getBill()).toBeDefined();
	    });
  	});

  	describe('Mocked HTTP successful request', function() {
	    beforeEach(inject(function($injector) {
			// Set up the mock http service responses
			$httpBackend = $injector.get('$httpBackend');
			$httpBackend.when('GET', 'bill/bill.json')
				.respond(200, 
					{
					  "statement": {
					    "generated": "2015-01-11",
					    "due": "2015-01-25",
					    "period": {
					      "from": "2015-01-26",
					      "to": "2015-02-25"
					    }
					  },
					  "total": 136.03,
					  "package": {
					    "subscriptions": [
					      { "type": "broadband", "name": "Fibre Unlimited", "cost": 16.40 }
					    ],
					    "total": 16.40
					  },
					  "callCharges": {
					    "calls": [
					      { "called": "07716393769", "duration": "00:23:03", "cost": 2.13 }
					    ],
					    "total": 2.13
					  },
					  "skyStore": {
					    "rentals": [
					      { "title": "50 Shades of Grey", "cost": 4.99 }
					    ],
					    "buyAndKeep": [
					      { "title": "Broke back mountain", "cost": 9.99 }
					    ],
					    "total": 14.98
					  }
					}
				);
	    }));

		afterEach(function() {
			$httpBackend.verifyNoOutstandingExpectation();
			$httpBackend.verifyNoOutstandingRequest();
		});


		it('should call the GET service to get bills', function() {
			var result = BillService.getBill();
			//expect(result).toContain("statement");
		});
  	});

  	describe('Mocked HTTP failure request', function() {
	    beforeEach(inject(function($injector) {
			// Set up the mock http service responses
			$httpBackend = $injector.get('$httpBackend');
			$httpBackend.when('GET', 'bill/bill.json')
				.respond(500, null);
	    }));

		afterEach(function() {
			$httpBackend.verifyNoOutstandingExpectation();
			$httpBackend.verifyNoOutstandingRequest();
		});

		it('should get null result', function() {
			var result = BillService.getBill();
			expect(result).toEqual({ content: null });
		});
  	});
});