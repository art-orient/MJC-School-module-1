package com.epam.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
    @Test
    void checkPositiveNumber() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("555"));
    }

    @Test
    void checkNegativeNumber() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("-7"));
    }

    @Test
    void checkZero() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("0"));
    }

    @Test
    void checkNotValidData() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("three"));
    }
}
