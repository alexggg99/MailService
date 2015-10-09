/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('MailListingController', function ($scope, $injector, mailService) {


    mailService.getMail()
        .success(function (data, status, headers) {
            $scope.email = data;
        }).error(function (data, status, headers) {
            console.log(data)
        });

    $scope.setSelectedMail = function(mail){
        $scope.selectedMail = mail;
        $scope.showReplay = true;
    };

    $scope.isSelected = function(mail){
        if($scope.selectedMail){
            return $scope.selectedMail === mail;
        }
    };

});