public class CountriesFifa {
    private String nome;
    private String confederacao;
    private double populacao;
    private double audienciaTV;
    private double gpd;

    public CountriesFifa(String nome, String confederacao, double populacao, double audienciaTV, double gpd) {
        this.nome = nome;
        this.confederacao = confederacao;
        this.populacao = populacao;
        this.audienciaTV = audienciaTV;
        this.gpd = gpd;
    }

    public String getNome() {
        return nome;
    }

    public double getAudienciaTV() {
        return audienciaTV;
    }

    public String toString() {
        return "Pais{" +
                "nome = '" + nome + '\'' +
                ", confederacao = '" + confederacao + '\'' +
                ", populacao = " + populacao +
                ", audienciaTV = " + audienciaTV +
                ", gpd = " + gpd +
                '}';
    }
}
