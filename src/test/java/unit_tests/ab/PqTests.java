package unit_tests.ab;

import ab.pq.PQ_Logic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class PqTests {

    private PQ_Logic pq;

    @BeforeEach
    void setUp() {
        pq = new PQ_Logic();
    }

    @ParameterizedTest
    @MethodSource("getStreamArguments")
    public void shouldReturnCorrectSolutionForPQ(double p, double q, double[] values) {
        // given

        // when
        double[] result = pq.calculatePQ(p, q);

        // then
        Arrays.sort(result);
        Arrays.sort(values);
        assertThat(result).isEqualTo(values);
    }

    @ParameterizedTest
    @MethodSource("getStreamArguments")
    public void shouldReturnCorrectLengthOfPQ(double p, double q, double[] values) {
        // given

        // when
        double[] result = pq.calculatePQ(p, q);

        // then
        assertThat(result.length).isEqualTo(values.length);
    }

    public static Stream<Arguments> getStreamArguments() {
        return Stream.of(
                Arguments.of(1, 1, new double[] {}),
                Arguments.of(4, 16, new double[] {}),
                Arguments.of(-3, 5, new double[] {}),
                Arguments.of(-4, 7, new double[] {}),
                Arguments.of(4, 4, new double[] {-2}),
                Arguments.of(-4, 4, new double[] {2}),
                Arguments.of(8, 16, new double[] {-4}),
                Arguments.of(10, 25, new double[] {-5}),
                Arguments.of(6, -7, new double[] {1, -7}),
                Arguments.of(4, -5, new double[] {1, -5}),
                Arguments.of(-4, 3, new double[] {3, 1}),
                Arguments.of(6, 5, new double[] {-1, -5})
        );
    }
}
