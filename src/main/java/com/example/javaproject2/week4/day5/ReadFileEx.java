package com.example.javaproject2.week4.day5;

import com.example.javaproject2.week4.day4.Address;
import com.example.javaproject2.week4.day4.Hospital;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {
    LineReader lineReader;
    Charset charset;

    public ReadFileEx(Charset charset) {
        this.charset = charset;
    }

    public List<String> getLines(String fileName) throws IOException {
        List<String> lines = new LinkedList<>();

        /*BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("C:\\Users\\pc\\Desktop\\1.병원정보서비스 2022.10..csv"),
                "EUC-KR"
        ));
        String line;
        while ((line = br.readLine()) != null) {
                lines.add(line);
            }

        return lines;
        */

        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));

        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    public Hospital parse(String str) {
        System.out.println(str);
        String[] splitted = str.split(",");
        Address address = new Address(splitted[10], splitted[5], splitted[7]);
        Hospital hospital = new Hospital(splitted[1], splitted[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        ReadFileEx rfe = new ReadFileEx(Charset.forName("UTF-8"));
        List<String> strLines = rfe.getLines("C:\\Users\\pc\\Desktop\\병원정보서비스.csv");
        List<Hospital> parsedHospital = rfe.getHospitals(strLines);
        for (int i = 0; i < parsedHospital.size(); i++) {
            Hospital hospital = parsedHospital.get(i);
            System.out.printf("%s %s\n", hospital.getName(), hospital.getWebsiteAddr());
        }
    }
}