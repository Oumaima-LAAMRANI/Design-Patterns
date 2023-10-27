package com.laamrani;

import com.laamrani.Hdmi;

public class TV implements Hdmi {
    @Override
    public void view(byte[] data) {
        System.out.println("?????? TV ?????");
        String message=new String(data);
        System.out.println(message);
        System.out.println("?????? TV ?????");
    }
}
