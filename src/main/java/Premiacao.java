import java.util.ArrayList;
import java.util.List;

public class Premiacao {
    private List<Jogador> jogadores = new ArrayList<>();

    public void indicar(String nomeJogador, String nacionalidade, String nomeTime, String nomePais){
        Time time = TimeFactory.getTime(nomeTime, nomePais);
        Jogador jogador = new Jogador(nomeJogador, nacionalidade, time);
        jogadores.add(jogador);
    }

    public List<String> obterJogadores() {
        List<String> saida = new ArrayList<String>();
        for (Jogador jogador : this.jogadores) {
            saida.add(jogador.obterJogador());
        }
        return saida;
    }
}
