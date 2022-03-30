package kata;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaRandomizerIT {

    private JavaRandomizer javaRandomizer = new JavaRandomizer();

    @Test
    public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {

        IntStream result = IntStream.range(0, 10000).map(i -> javaRandomizer.getRouletteResult());

        assertThat(result.min().getAsInt()).isEqualTo(0);
        assertThat(result.max().getAsInt()).isEqualTo(37);
    }

    @Test
    public void allNumbersOccur() throws Exception {

        IntStream result = IntStream.range(0, 10000).map(i -> javaRandomizer.getRouletteResult());

        IntStream results = result.distinct();
        assertThat(results).size().isEqualTo(38);

    }


}
