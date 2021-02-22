package firstGlassFishClient.service;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:8080/firstGlassFish5521875622621419154/TempConverterImplService?wsdl");

		QName qName = new QName("http://service/", "TempConverterImplService");
		Service service = Service.create(url, qName);

		QName port = new QName("http://service/", "TempConverterImplPort");

		TempConverter tv = service.getPort(port, TempConverter.class);

		// got error
		System.out.println(tv.c2f(100));
		System.out.println(tv.f2c(218));
	}

}
