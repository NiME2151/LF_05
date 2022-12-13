package unit_tests;

import ab.pq.PQ_Logic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PqTests {

    private PQ_Logic pq_logic;

    @BeforeEach
    void setUp() {
        pq_logic = new PQ_Logic();
    }

    @Test
    public void shouldReturnNullWhenInputValuesPAndQAreBothOne() {
        // given
        double p = 1;
        double q = 1;

        // when
        double[] result = pq_logic.calcPQFormula(p, q);

        // then
        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenNoResultIsReturned() {
        // given
        double p = 1;
        double q = 1;

        // when
        double[] result = pq_logic.calcPQFormula(p, q);

        // then
        assertNull(result);
    }

    @Test
    public void shouldReturnNegativeTwoWhenInputValuesPAndQAreBothFour() {
        // given
        double p = 4;
        double q = 4;

        // when
        double[] result = pq_logic.calcPQFormula(p, q);

        // then
        assertEquals(-2, result[0]);
    }

    @Test
    public void shouldReturnLengthOfOneWhenOneResultIsReturned() {
        // given
        double p = 4;
        double q = 4;

        // when
        double[] result = pq_logic.calcPQFormula(p, q);

        // then
        assertEquals(1, result.length);
    }

    @Test
    public void shouldReturnPositiveOneAndNegativeSevenWhenInputValuePIsSixAndQIsNegativeSeven() {
        // given
        double p = 6;
        double q = -7;

        // when
        double[] result = pq_logic.calcPQFormula(p, q);

        // then
        assertEquals(1, result[0]);
        assertEquals(-7, result[1]);
    }

    @Test
    public void shouldReturnLengthOfTwoWhenTwoResultsAreReturned() {
        // given
        double p = 6;
        double q = -7;

        // when
        double[] result = pq_logic.calcPQFormula(p, q);

        // then
        assertEquals(2, result.length);
    }
}
