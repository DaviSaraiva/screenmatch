package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DataEpe;
import br.com.alura.screenmatch.model.DataSeries;
import br.com.alura.screenmatch.service.APIConsumption;
import br.com.alura.screenmatch.service.CovertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		APIConsumption apiConsumption = new APIConsumption();
		var json = apiConsumption.getData("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println("Dados dos json: " +json);

		CovertData conversor = new CovertData();
		DataSeries dadosSeries = conversor.getData(json, DataSeries.class);
		System.out.println("Dados formatados " + dadosSeries);

		json = apiConsumption.getData("https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=2&apikey=6585022c");
		DataEpe dadosEpisodios = conversor.getData(json, DataEpe.class);
		System.out.println("Dados formatados dos episodios " + dadosEpisodios );

	}
}
