package com.image.viewer.properties;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:images-source.properties")
@ConfigurationProperties
@Data
@ToString
public class ImagesSourceProperties {

    @Value("protocol")
    private String protocol;

    @Value("domain")
    private String domain;

    @Value("route")
    private String route;

}
