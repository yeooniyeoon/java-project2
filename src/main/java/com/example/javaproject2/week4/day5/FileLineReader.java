package com.example.javaproject2.week4.day5;

import com.example.javaproject2.week4.day5.LineReader;

import java.util.List;

public class FileLineReader implements LineReader {
    private String fileName;

    public FileLineReader(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public List<String> getLines() {
        return null;
    }
}
