/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('ContentController', function($scope, $injector, mailService) {

    $scope.showingReplay = false;
    $scope.replay = {};

    //$scope.replay.to = $scope.selectedMail.from;

    $scope.showReplay = function(){
        $scope.showingReplay = true;
    };

    $scope.cancelReplay = function(){
        $scope.replay.body = '';
    }

    $scope.$watch('selectedMail', function(evt){
        $scope.replay = {};

    })

    $scope.sendReplay = function(){
        $scope.replay.to = $scope.selectedMail.from;
        $scope.replay.subject = $scope.selectedMail.subject;
        mailService.sendEmail($scope.replay)
            .then(function(data){
                $scope.email.push(data);

            }, function(err){
                console.log(err);
            })
    }



});