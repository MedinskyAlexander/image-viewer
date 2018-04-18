package com.image.viewer.http.client;

import com.image.viewer.model.Image;
import com.image.viewer.properties.ImagesSourceProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class ImageClientImpl implements ImageClient {

    private RestTemplate restTemplate;
    private URI uri;


    public ImageClientImpl(RestTemplate restTemplate, ImagesSourceProperties properties) {
        this.restTemplate = restTemplate;
        this.uri = UriComponentsBuilder.newInstance()
                .scheme(properties.getProtocol())
                .host(properties.getDomain())
                .path(properties.getRoute())
                .build()
                .toUri();
    }

    @Override
    public List<Image> getImages() {
        ResponseEntity<Image[]> response = restTemplate.getForEntity(uri, Image[].class);
        if (response.getStatusCode().is2xxSuccessful()) {
            return Arrays.asList(response.getBody());
        }
        return Collections.emptyList();
    }
}
