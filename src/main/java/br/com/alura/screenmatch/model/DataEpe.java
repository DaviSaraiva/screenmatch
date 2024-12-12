package br.com.alura.screenmatch.model;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataEpe(@JsonAlias("Title") String title,
                      @JsonAlias("Episode") Integer numEp,
                      @JsonAlias("imdbRating") String avaliation,
                      @JsonAlias("Released") String dateLaunch) {

}
