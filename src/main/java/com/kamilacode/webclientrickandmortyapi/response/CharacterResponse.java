package com.kamilacode.webclientrickandmortyapi.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)


public class CharacterResponse {

    private String id;
    private String name;
    private String status;
    private String species;
    private String image;
    private List<String> episode;


}
