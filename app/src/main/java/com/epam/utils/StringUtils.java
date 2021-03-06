package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isCreatable(str) && NumberUtils.createBigDecimal(str).compareTo(BigDecimal.ZERO) > 0;
    }

    private StringUtils() {
    }
}
