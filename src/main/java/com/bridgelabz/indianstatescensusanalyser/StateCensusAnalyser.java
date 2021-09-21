package com.bridgelabz.indianstatescensusanalyser;

public class StateCensusAnalyser {

    public int loadIndianStateCensusData(String filePath) throws StateCensusAnalyserException {
        Class<CsvStateCensus> csvStateCensusClass = CsvStateCensus.class;
        CsvLoader loader = new CsvLoader<CsvStateCensus>();
       return loader.loadCSVFile(filePath,csvStateCensusClass);
    }
}
