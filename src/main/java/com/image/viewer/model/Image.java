package com.image.viewer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Image {

    @JsonProperty
    private Integer albumId;

    @JsonProperty
    private Integer id;

    @JsonProperty
    private String title;

    @JsonProperty
    private String url;

    @JsonProperty
    private String thumbnailUrl;

}
