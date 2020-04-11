package dto;

public class JokeDTO {
    private String joke1;
    private String joke1Reference;
    private String joke2;
    private String joke2Reference;

    public JokeDTO() {
    }

    public JokeDTO(DaddyDTO daddyDTO, ChuckDTO ChuckDTO) {
        this.joke1 = daddyDTO.getJoke();
        this.joke1Reference = "https://icanhazdadjoke.com/";
        this.joke2 = ChuckDTO.getValue();
        this.joke2Reference = "https://api.chucknorris.io/jokes/random";
    }

    public String getJoke1() {
        return joke1;
    }

    public void setJoke1(String joke1) {
        this.joke1 = joke1;
    }

    public String getJoke2() {
        return joke2;
    }

    public void setJoke2(String joke2) {
        this.joke2 = joke2;
    }

    public String getJoke1Ref() {
        return joke1Reference;
    }

    public void setJoke1Ref(String joke1Ref) {
        this.joke1Reference = joke1Ref;
    }

    public String getJoke2Ref() {
        return joke2Reference;
    }

    public void setJoke2Ref(String joke2Ref) {
        this.joke2Reference = joke2Ref;
    }
}