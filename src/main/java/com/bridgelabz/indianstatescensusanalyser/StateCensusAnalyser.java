package com.bridgelabz.indianstatescensusanalyser;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.StreamSupport;

public class StateCensusAnalyser {

    public static int loadIndianStateCensusData(String filePath) throws IOException
    {
        Reader reader = Files.newBufferedReader(Paths.get(filePath));
        CsvToBeanBuilder<CSVStateCensus> csvToBeanBuilder = new CsvToBeanBuilder<>(reader);
        csvToBeanBuilder.withType(CSVStateCensus.class);
        csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
        CsvToBean<CSVStateCensus> csvToBean = csvToBeanBuilder.build();
        Iterator<CSVStateCensus> censusCSVIterator = csvToBean.iterator();
        Iterable<CSVStateCensus>  csvIterable = () -> censusCSVIterator;
        int numberOfEntries = (int) StreamSupport.stream(csvIterable.spliterator(),false).count();
        return numberOfEntries;
    }
}
