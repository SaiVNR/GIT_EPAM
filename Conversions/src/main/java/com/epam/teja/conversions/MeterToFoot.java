package com.epam.teja.conversions;

/**
 * @author Saiteja_Suggula
 *
 */
public class MeterToFoot implements Convert {

    /**
     * @param valueToBeConverted Takes value which is to be converted.
     * @return converted value.
     */
    public double convert(final double valueToBeConverted) {
        final double multiplier = 3.28084;
        return valueToBeConverted * multiplier;
    }
}
