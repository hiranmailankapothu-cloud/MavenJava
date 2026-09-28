package com.example.student_grade_calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void testTotalMarks() {
        int mark1 = 80;
        int mark2 = 75;
        int mark3 = 90;

        int total = mark1 + mark2 + mark3;

        assertEquals(245, total);
    }
}