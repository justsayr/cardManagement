//var app = angular.module("ngApp", ["ngRoute"]);
//var myApp = angular.module('myApp', []);

//app.conroller('userCtrl',["$scope", function($scope){

var app = angular.module('ngApp', ['ngRoute']);
app.controller('userCtrl', function ($scope) {
	
	$scope.message = "Hi Ram";
	
});