package br.com.erudio;

public class Greeting {
    
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    //como o 'final' foi usado então é somente permitido gerar os getters
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
