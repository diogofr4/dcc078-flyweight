import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PremiacaoTest {
    @Test
    void deveRetornarJogadores() {
        Premiacao premiacao = new Premiacao();
        premiacao.indicar("Casemiro", "brasileiro", "Manchester United", "Inglaterra");
        premiacao.indicar("Mike Maignan", "francês", "Milão", "Itália");
        premiacao.indicar("Cristiano Ronaldo", "português", "Manchester United", "Inglaterra");
        premiacao.indicar("Kylian Mbappé", "francês", "Paris Saint-Germain", "França");

        List<String> saida = Arrays.asList(
                "Jogador{nome='Casemiro'nacionalidade='brasileiro', time='Manchester United', país='Inglaterra'}",
                "Jogador{nome='Mike Maignan'nacionalidade='francês', time='Milão', país='Itália'}",
                "Jogador{nome='Cristiano Ronaldo'nacionalidade='português', time='Manchester United', país='Inglaterra'}",
                "Jogador{nome='Kylian Mbappé'nacionalidade='francês', time='Paris Saint-Germain', país='França'}");

        assertEquals(saida, premiacao.obterJogadores());
    }

    @Test
    void deveRetornarTotalTimes() {
        Premiacao premiacao = new Premiacao();
        premiacao.indicar("Casemiro", "brasileiro", "Manchester United", "Inglaterra");
        premiacao.indicar("Mike Maignan", "francês", "Milão", "Itália");
        premiacao.indicar("Cristiano Ronaldo", "português", "Manchester United", "Inglaterra");
        premiacao.indicar("Kylian Mbappé", "francês", "Paris Saint-Germain", "França");

        assertEquals(3, TimeFactory.getTotalTimes());
    }
}
