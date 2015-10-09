/**
 * Created by alexggg99 on 19.07.15.
 */

function mailService($http, $q){
    var getMail = function(){
        return $http({
            method: 'GET',
            url:'/api/mail'
        });

    }

    var sendEmail = function(mail){
        var d = $q.defer();
        $http({
            method: 'POST',
            data: mail,
            url: '/api/send'
        }).success(function(data, status, header){
            d.resolve(data)
        }).error(function(data, status, header){
            d.reject(data);
        });

        return d.promise;
    }

    return {
        getMail: getMail,
        sendEmail: sendEmail
    };
}

app.service("mailService", mailService);