

angular.module('exercicio3', [])
  .controller('CONT', function($scope, $http) {
    $scope.calcular = function(x,y,w,z) {
      var Params = {
        method: 'POST',
        url: 'http://localhost:8080/service/Eduardo/exercicio3',
        headers: { 'Content-Type': 'application/json' },
        data: { 'requestEx3Bean': {'valor1':x,'valor2':y,'valor3':w,'valor4':z}}
		      
      };

      $http(Params).then(function(evt) {
        $scope.valor1 = evt.data.responseEx3Bean.soma;
        $scope.valor2 = evt.data.responseEx3Bean.produto;
        $scope.valor3 = evt.data.responseEx3Bean.media;
        
      });
    };

  });
