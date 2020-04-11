package jokefetcher;

import com.google.gson.Gson;
import java.io.IOException;
import utils.HttpUtils;


public class JokeFetcher {
    public static void main(String[] args) throws IOException {
        String chucky = HttpUtils.fetchData("https://api.chucknorris.io/jokes/random");
        String daddy = HttpUtils.fetchData("https://icanhazdadjoke.com");
        
        System.out.println("JSON fetched from chucknorris:");
        System.out.println(chucky);
        System.out.println("JSON fetched from dadjokes:");
        System.out.println(daddy);
    }
}