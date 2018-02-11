package com.codecool.krk;

import com.codecool.krk.tinker.tailor.TinkerTailor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinkerTailorTest {

    TinkerTailor fillList() {
        TinkerTailor tailor = new TinkerTailor(6, 2);
        return tailor;
    }

    @Test
    void winnerTest() {
        TinkerTailor tailor = fillList();
        int expected = 5;
        assertEquals(expected, tailor.letsPlay());
    }
}