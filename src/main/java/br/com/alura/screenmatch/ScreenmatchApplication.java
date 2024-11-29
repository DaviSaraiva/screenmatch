package br.com.alura.screenmatch;

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
		DataSeries dados = conversor.getData(json, DataSeries.class);
		System.out.println("Dados formatados" + dados);
	}
}
