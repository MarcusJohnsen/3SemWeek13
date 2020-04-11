package rest;

import com.google.gson.Gson;
import dto.ChuckDTO;
import dto.DaddyDTO;
import dto.JokeDTO;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import utils.HttpUtils;

@Path("jokes")
public class JokeResource {

    @Context
    private UriInfo context;
    private final static Gson GSON = new Gson();
   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJokes() throws Exception {
            String chuckString = HttpUtils.fetchData("https://api.chucknorris.io/jokes/random");
            String dadString = HttpUtils.fetchData("https://icanhazdadjoke.com");
            DaddyDTO daddy = GSON.fromJson(dadString, DaddyDTO.class);
            ChuckDTO chucky = GSON.fromJson(chuckString, ChuckDTO.class);
            JokeDTO joke = new JokeDTO(daddy, chucky);
            return GSON.toJson(joke);
    }
}