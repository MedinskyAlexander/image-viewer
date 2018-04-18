package com.image.viewer.controller;

import com.image.viewer.model.Image;
import com.image.viewer.service.ImageService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/images")
public class ImageController {

    private ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Image> getImages() {
        return imageService.findAll();
    }

}
