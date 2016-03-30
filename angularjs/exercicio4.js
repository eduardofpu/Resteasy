

angular.module('exercicio4', [])
  .controller('CONT', function($scope, $http) {
    $scope.calcular = function(x,y) {
      var Params = {
        method: 'POST',
        url: 'http://localhost:8080/service/Eduardo/exercicio4',
        headers: { 'Content-Type': 'application/json' },
        data: { 'requestEx4Bean': {'a':x,'b':y}}
		      
      };

      $http(Params).then(function(evt) {
        $scope.valor1 = evt.data.responseEx4Bean.resposta;
        
        
      });
    };

  });
