/**
 * Created by alexggg99 on 19.07.15.
 */


app.controller('SettingsController', function($scope) {

    $scope.settings = {
        name: "Ari",
        email: "me@example.org",
        age: 12
    };

    $scope.updateSettings = function(){
        console.log("update settings");
    }

});