package com.example.javaproject2.programmers;

public class HandlingCode {
    public String solution(String code) {
        String ret = "";
        boolean mode = false;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1')
                mode = !mode;
            else if (mode == false && i % 2 == 0)
                ret += code.charAt(i);
            else if (mode == true && i % 2 != 0)
                ret += code.charAt(i);
        }
        if (ret.isEmpty())
            return "EMPTY";
        return ret;
    }
}
