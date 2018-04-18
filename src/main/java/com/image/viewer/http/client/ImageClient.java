package com.image.viewer.http.client;

import com.image.viewer.model.Image;

import java.util.List;

public interface ImageClient {

    List<Image> getImages();

}
