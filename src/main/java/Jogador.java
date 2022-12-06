public class Jogador {
    private String nome;
    private String nacionalidade;
    private Time time;

    public Jogador(String nome, String nacionalidade, Time time) {
        this.nome = nome;
        this.time = time;
        this.nacionalidade = nacionalidade;
    }

    public String obterJogador() {
        return "Jogador{" +
                "nome='" + this.nome + '\'' +
                "nacionalidade='" + this.nacionalidade + '\'' +
                ", time='" + time.getNome() + '\'' +
                ", país='" + time.getPais() + '\'' +
                '}';
    }
}
