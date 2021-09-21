package com.bridgelabz.indianstatescensusanalyser;


import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class StateCensusAnalyserTest {
    public static final String INCORRECT_CSV_FILE = "./incorrectFilePath.csv";
    public static final String CORRECT_CSV_FILE = "/home/rajatsp/bridgelabz/day29/assignment/IndianStatesCensusAnalyser/IndianStateCensusData.csv";
    public static final String CSV_FILE_INDIA_STATE_CODE = "IndiaStateCode";

    @Test
    public void givenIndianCensusCSVFile_ShouldReturnCorrectRecords() throws IOException {
        StateCensusAnalyser analyser = new StateCensusAnalyser();
        int count = analyser.loadIndianStateCensusData(CORRECT_CSV_FILE);
        assertEquals(29, count);
    }
}
