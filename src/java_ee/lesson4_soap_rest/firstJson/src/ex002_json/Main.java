package ex002_json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	
	public static void main(String[] args) throws Exception{
		String request = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?date=20210214&json";
		
		String result = performRequest(request);
		
		Gson gson = new GsonBuilder().create();
		
		Currency[] currencies = gson.fromJson(result, Currency[].class);
		
		for(Currency currency : currencies) {
			System.out.println(currency.getR030() + " " + currency.getRate() + " " + currency.getTxt()
			+ " " + currency.getCc() + " " + currency.getExchangedate());
		}
		System.out.println("JSON: \n\n" + gson.toJson(currencies));
	}

	private static String performRequest(String urlStr) throws IOException{
		URL url = new URL(urlStr);
		StringBuilder sb = new StringBuilder();
		
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
			char[] buf = new char[1000000];
			
			int r = 0;
			do {
				if((r = br.read(buf)) > 0)
					sb.append(new String(buf, 0, r));
			} while (r > 0);
		} finally {
			http.disconnect();
		}
		
		return sb.toString();
	}
}
