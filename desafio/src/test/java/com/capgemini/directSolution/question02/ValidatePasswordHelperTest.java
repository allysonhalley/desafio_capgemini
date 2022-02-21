package com.capgemini.directSolution.question02;

import static org.junit.Assert.assertEquals;

import com.capgemini.alternativeSolution.question02.ValidatePasswordHelper;

import org.junit.Test;

public class ValidatePasswordHelperTest {


    @Test
    public void testValidateEmpty() {        

        String password = "";
        boolean actual = ValidatePasswordHelper.validateLength(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void testValidateLengthHigherOrEquals6True() {        
        
        String password = "A$sf28";
        boolean actual = ValidatePasswordHelper.validateLength(password);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void testValidateLengthHigher6False() {        
        
        String password = "A$s";
        boolean actual = ValidatePasswordHelper.validateLength(password);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void testValidateNumberTrue() {
        final String regex = "[0-9]";
        final String password = "132";
        boolean actual = ValidatePasswordHelper.validateCharacteres(regex, password);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testValidateNumberFalse() {
        final String regex = "[0-9]";
        final String password = "aa";
        boolean actual = ValidatePasswordHelper.validateCharacteres(regex, password);
        boolean expected = false;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testValidateLowerLetter() {
        String ONE_LOWER_LETTER = "[a-z]";
        String password = "asdASDF";
        boolean actual = ValidatePasswordHelper.validateCharacteres(ONE_LOWER_LETTER, password);
        boolean expected = true;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testValidateUpperLetter() {
        String ONE_UPPER_LETTER = "[A-Z]";
        String password = "asd";
        boolean actual = ValidatePasswordHelper.validateCharacteres(ONE_UPPER_LETTER, password);
        boolean expected = false;
        assertEquals(expected, actual);
        
    }

}
