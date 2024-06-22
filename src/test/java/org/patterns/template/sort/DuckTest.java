package org.patterns.template.sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class DuckTest {

    @Test
    void shouldSortDucksArray() {

        Duck[] ducks = new Duck[4];
        ducks[0] = new Duck(1,2);
        ducks[1] = new Duck(5,2);
        ducks[2] = new Duck(3,2);
        ducks[3] = new Duck(6,2);

        Arrays.sort(ducks);

        assertEquals(1, ducks[0].weight);
        assertEquals(3, ducks[1].weight);
        assertEquals(5, ducks[2].weight);
        assertEquals(6, ducks[3].weight);
    }

}