package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataSeries(@JsonAlias("Title") String title,
                         @JsonAlias("totalSeasons") Integer totalSeason,
                         @JsonAlias("imdbRating") String avaliation) {

}