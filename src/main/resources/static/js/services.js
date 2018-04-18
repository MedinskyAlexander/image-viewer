'use strict';

angular.module('ImageViewer').factory('ImageViewerService', ['$http', function ($http) {

    var srv = {};

    srv.getImages = function () {
        return $http.get('/images');
    };

    return srv;

}]);