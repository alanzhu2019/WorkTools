package com.alan.services.impl;

import com.alan.services.CreateSerialNumber;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateSerialNumberImp implements CreateSerialNumber {

    @Test
    @Override
    public void createBarcodeNum() {

        Date date = new Date();

        String string = new SimpleDateFormat("yyMMdd").format(date).toString();

        System.out.println(string);

        int num =1;

        String s = String.format("%03d", num);
        System.out.println(s);


    }
}
