package com.epam.teja.conversions;

/**
 * @author Saiteja_Suggula
 *
 */
public class FootToMeter implements Convert {

    /**
     * @param valueToBeConverted Takes value which is to be converted.
     * @return converted value.
     */
    public double convert(final double valueToBeConverted) {
        final double multiplier = 0.3048;
        return valueToBeConverted * multiplier;
    }
}


