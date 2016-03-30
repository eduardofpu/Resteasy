

angular.module('exercicio1', [])
  .controller('CONT', function($scope, $http) {
    $scope.calcular = function(x) {
      var Params = {
        method: 'POST',
        url: 'http://localhost:8080/service/Eduardo/exercicio1',
        headers: { 'Content-Type': 'application/json' },
        data: { 'requestEx1Bean': {'value1':x}}
		      
      };

      $http(Params).then(function(evt) {
        $scope.valor = evt.data.responseEx1Bean.response;
      });
    };

  });
