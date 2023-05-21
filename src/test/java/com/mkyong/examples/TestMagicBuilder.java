package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMagicBuilder {

    @Test
    public void testLucky() {
        assertEquals(7, MagicBuilder.getLucky());
    }

    @Test
    public void testUnlucky() {
        assertEquals(8, MagicBuilder.getLucky());
    }

    @Test
    public void Test_Unlucky() {
        assertEquals(7, MagicBuilder.getLucky());
    }
}
