package com.epam.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
    @Test
    void isPositiveNumberPositiveTest() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("555"));
    }

    @Test
    void isPositiveNumberNegativeTest() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("-7"));
    }

    @Test
    void isPositiveNumberZeroTest() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("0"));
    }

    @Test
    void isPositiveNumberNotValidTest() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("three"));
    }
}
