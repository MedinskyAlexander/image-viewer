'use strict';

angular.module('ImageViewer').factory('ImageViewerService', ['$http', function ($http) {

    var srv = {};

    srv.getImages = function () {
        return $http.get('/api/images');
    };

    return srv;

}]);