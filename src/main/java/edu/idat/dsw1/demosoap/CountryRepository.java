package edu.idat.dsw1.demosoap;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
	private static final Map<String, Country> countries = new HashMap<>();

	@PostConstruct
	public void initData() {
		Country monday = new Country();
		monday.setName("lunes");
		monday.setCapital("monday");
		

		countries.put(monday.getName(), monday);

		Country martes = new Country();
		martes.setName("martes");
		martes.setCapital("tuesday");
		

		countries.put(martes.getName(), martes);

		Country miercoles = new Country();
		miercoles.setName("miercoles");
		miercoles.setCapital("wednesday");
		

		countries.put(miercoles.getName(), miercoles);

		Country jueves = new Country();
		jueves.setName("jueves");
		jueves.setCapital("thursday");
		

		countries.put(jueves.getName(), jueves);

		Country viernes = new Country();
		viernes.setName("viernes");
		viernes.setCapital("friday");
		

		countries.put(viernes.getName(), viernes);

		Country sabado = new Country();
		sabado.setName("sabado");
		sabado.setCapital("saturday");
		

		countries.put(sabado.getName(), sabado);

		Country domingo = new Country();
		domingo.setName("domingo");
		domingo.setCapital("sunday");
		

		countries.put(domingo.getName(), domingo);
	}

	public Country findCountry(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return countries.get(name);
	}
}