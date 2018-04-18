'use strict';

angular.module('ImageViewer').controller('ImageViewerController', ['$scope', 'ImageViewerService', function ($scope, ImageViewerService) {

    $scope.images = [];

    $scope.getImages = function () {
        ImageViewerService.getImages()
            .then(function (response) {
                console.log(response);
                if (response) {
                    $scope.images = response.data;
                }
            });
    };

    $scope.getImages();
}]);