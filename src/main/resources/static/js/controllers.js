'use strict';

angular.module('ImageViewer').controller('ImageViewerController', ['$scope', 'ImageViewerService', function ($scope, ImageViewerService) {

    $scope.getImages = function () {
        ImageViewerService.getImages()
            .success(function (response) {
                console.log(response);
            });
    };

    $scope.getImages();

}]);