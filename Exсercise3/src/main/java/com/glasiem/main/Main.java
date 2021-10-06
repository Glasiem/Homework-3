package com.glasiem.main;

import com.glasiem.converter.Converter;

public class Main {

    public static void main(String[] args) {
        Converter c1 = new Converter(0.038,0.033);
        System.out.println(c1.usdtohrn(1));
        System.out.println(c1.eurtohrn(1));
        System.out.println(c1.hrntousd(1));
        System.out.println(c1.hrntoeur(1));
    }
}
