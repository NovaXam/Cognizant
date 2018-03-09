package com.cognizant;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCases {
    @Test
    public void testModel() {
       Car ownerCar = new Car("Lexus", 5000);

       ownerCar.setOwner("Max");
       assertEquals(ownerCar.getterOwner(0), "Max");
       assertEquals(ownerCar.getterModel(), "Lexus");
    }

    @Test
    public void testAninalClass() {
        Animals testObj = new Animals();

        testObj.setName("wolf");
        testObj.setTopSpeed(50);
        testObj.setEndangered("yes");
        testObj.setNumLebs(4);

        assertEquals("wolf", testObj.getName());
        assertEquals(50, testObj.getTopSpeed());
        assertEquals(true, testObj.getDangerLevel());
        assertEquals(4, testObj.getNumLegs());

    };
};
