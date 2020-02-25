package com.apitesting.sample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    @Test
       public void testAdd() {

            System.out.println("add");

            Integer a = 15;
            Integer b = 15;

            Integer expResult = 30;
            Integer result = App.add(a, b);
            assertEquals(expResult, result);
            assertEquals(null, App.add(15, null));
            assertEquals(null, App.add(null, 15));
            assertEquals(null, App.add(null, null));

        }
    }

