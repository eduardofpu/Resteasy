

angular.module('exercicio5', [])
  .controller('CONT', function($scope, $http) {
    $scope.calcular = function(x,y) {
      var Params = {
        method: 'POST',
        url: 'http://localhost:8080/service/Eduardo/exercicio5',
        headers: { 'Content-Type': 'application/json' },
        data: { 'requestEx5Bean': {'a':x,'b':y}}
		      
      };

      $http(Params).then(function(evt) {
        $scope.valor1 = evt.data.responseEx5Bean.resposta;
        
        
      });
    };

  });
