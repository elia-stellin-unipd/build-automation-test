////////////////////////////////////////////////////////////////////
// Elia Ernesto Stellin 2101084
// Mattia Scomparin 2110992
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;

public class IntegerToRomanTest {

    @Test
    public void test1() {
        assert((new IntegerToRoman()).one() == 1);
    }
}