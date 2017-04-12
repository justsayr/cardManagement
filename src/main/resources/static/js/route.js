app.config(['$routeProvider','$locationProvider', function($routeProvider, $locationProvider){
	
	$locationProvider.hashPrefix('');
	
	$routeProvider
	.when('/details',{
		templateUrl:"view/details.html"
	}).when('/details2',{
		templateUrl:"view/details2.html"
	});
	
}]);