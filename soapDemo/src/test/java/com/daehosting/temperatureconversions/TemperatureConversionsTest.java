package com.daehosting.temperatureconversions;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by bmodahl on 2/27/17.
 */
public class TemperatureConversionsTest {
    @Test
    public void getTemperatureConversionsSoap12() throws Exception {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();

        BigDecimal tempConversion = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));

        assertEquals("Conversion Failed", tempConversion, BigDecimal.valueOf(32));

        BigDecimal tempConversion2 = service.fahrenheitToCelsius(BigDecimal.valueOf(32));

        assertEquals("Conversion Failed", tempConversion2, BigDecimal.valueOf(0));

        BigDecimal tempConversion3 = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(12));

        assertEquals("Conversion Failed", tempConversion3, BigDecimal.valueOf(-10.7484));

        BigDecimal tempConversion4 = service.windChillInFahrenheit(BigDecimal.valueOf(72), BigDecimal.valueOf(46));

        assertEquals("Conversion Failed", tempConversion4, BigDecimal.valueOf(58.79351984));
    }

}