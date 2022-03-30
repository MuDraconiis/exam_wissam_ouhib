package kata;


import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.within;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BallTest {

    @Test
    public void itRollsForAGivenAmountOfTime() throws Exception {

        int givenTime = 20000;
        Ball ball = new Ball();

        double time1 = System.currentTimeMillis();
        ball.roll();
        double time2 = System.currentTimeMillis();

        Offset<Double> error = within(4d);
        System.out.println("xxxxxxx "+ error);

        assertThat(time2 - time1).isCloseTo(givenTime,error);

    }
}
