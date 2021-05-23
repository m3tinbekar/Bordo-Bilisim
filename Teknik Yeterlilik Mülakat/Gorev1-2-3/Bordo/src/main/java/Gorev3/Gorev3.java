/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gorev3;


import java.io.IOException;


import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.util.Scanner;


import org.json.JSONObject;

 

/**
 *
 * @author metin
 */
public class Gorev3 {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("IP Giriniz:");
        String ip = scan.nextLine();
        String POSTS_API_URL = "http://ip-api.com/json/"+ip;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().GET().header("accept", "application/json").uri(URI.create(POSTS_API_URL)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        String Info = response.body();
         
        
        
        JSONObject obj = new JSONObject(Info);
        String country = obj.getString("country").toString();
        Double latitude = obj.getDouble("lat");
        Float longitude = obj.getFloat("lon");
        System.out.println("IP: "+ip);
        System.out.println("Latitude: "+latitude);
        System.out.println("Longitude: "+longitude);
        System.out.print("Country: "+country); 

    }

    

    

}
