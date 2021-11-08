package com.kamilacode.webclientrickandmortyapi.controller;


import com.kamilacode.webclientrickandmortyapi.client.RickAndMortyClient;
import com.kamilacode.webclientrickandmortyapi.response.CharacterResponse;
import com.kamilacode.webclientrickandmortyapi.response.EpisodeResponse;
import com.kamilacode.webclientrickandmortyapi.response.ListOfEpisodesResponse;
import com.kamilacode.webclientrickandmortyapi.response.LocationResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/webclient")
@AllArgsConstructor
public class RickAndMortyController {

    RickAndMortyClient rickAndMortyClient;


    @GetMapping("/character/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<CharacterResponse> getCharacterById(@PathVariable String id) {
        return rickAndMortyClient.findACharacterById(id);

    }


    @GetMapping("/location/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<LocationResponse> getLocationById(@PathVariable String id) {
        return rickAndMortyClient.findALocationById(id);

    }


    @GetMapping("/episode/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<EpisodeResponse> getEpisodeById(@PathVariable String id) {
        return rickAndMortyClient.findAEpisodeById(id);

    }


    @GetMapping("/episodes")
    @ResponseStatus(HttpStatus.OK)
    public Flux<ListOfEpisodesResponse> ListAllEpisodes() {
        return rickAndMortyClient.ListAllEpisodes();

    }


}
