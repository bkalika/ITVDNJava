package ex001_json;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	
	public static void main(String[] args) {
		Person person = new Person("Bohdan", 24, Arrays.asList("Kyiv", "Lviv", "Charkiv"));
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String json = gson.toJson(person);
		
		System.out.println(json);
		
		Person person1 = gson.fromJson(json, Person.class);
		
		System.out.println(person1.getName() + " " + person1.getAge());
		
		List<String> geos = person1.getGeoHistory();
		
		for(String geo : geos) {
			System.out.println(geo);
		}
	}

}
