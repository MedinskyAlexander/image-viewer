package com.image.viewer.service;

import com.image.viewer.http.client.ImageClient;
import com.image.viewer.model.Image;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    private ImageClient imageClient;

    public ImageServiceImpl(ImageClient imageClient) {
        this.imageClient = imageClient;
    }

    @Override
    public List<Image> findAll() {
        return imageClient.getImages();
    }
}
