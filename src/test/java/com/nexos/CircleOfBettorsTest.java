package com.nexos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleOfBettorsTest {
    private CircleOfBettors circle;

    @BeforeEach
    public void setUp() {
        circle = new CircleOfBettors(5);
    }

    @Test
    public void testCircleSize() {
        assertEquals(5, circle.size());
    }

    @Test
    public void testGetBettor() {
        Bettor bettor = circle.getBettor(0);
        assertNotNull(bettor);
        assertEquals(1, bettor.getNumber());
    }

    @Test
    public void testSetRemoved() {
        circle.setRemoved(2);
        assertTrue(circle.isRemoved(2));
    }
}