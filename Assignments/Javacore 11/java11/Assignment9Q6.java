package Java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Assignment9Q6 {
	public static void main(String[] args) {
		String uri="https://httpbin.org/get";
		// to take the URI
		HttpRequest req=HttpRequest.newBuilder()
				.uri(URI.create(uri))
				.GET()
				.build();
		//creating client
		HttpClient client=HttpClient.newBuilder()
				.build();
		
		//response
		HttpResponse<String>resp;
		
			try {
				resp=client.send(req, BodyHandlers.ofString());
				System.out.println(resp.headers());
				System.out.println(resp.statusCode());
				System.out.println(resp.body());
				
			} catch (IOException e) {
				
				e.printStackTrace();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 
		}

}
