package kata;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RouletteAT {

    private Ball ball = mock(Ball.class);
    private Between0And37Randomizer B037R = mock(Between0And37Randomizer.class);


    @Test
    public void itWaitsForTheBallToStop() {
        Roulette r = new Roulette(ball, B037R);
        r.playGame();

        verify(ball).roll();
    }

    @Test()
    public void itProvidesAResultWithColor() throws Exception {
    }

}
