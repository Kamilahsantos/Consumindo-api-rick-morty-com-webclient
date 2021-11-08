package com.kamilacode.webclientrickandmortyapi.response;


import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)

public class ListOfEpisodesResponse {

    List<EpisodeResponse> results;
}
