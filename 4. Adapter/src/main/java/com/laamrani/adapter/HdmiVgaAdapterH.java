package com.laamrani.adapter;

import com.laamrani.Hdmi;
import com.laamrani.TV;
import com.laamrani.Vga;

public class HdmiVgaAdapterH extends TV implements Vga{
    private Hdmi hdmi;
    @Override
    public void print(String message) {
        System.out.println("--------Adapter-------");
        byte[] data=message.getBytes();
        hdmi.view(data);
        System.out.println("--------Adapter-------");
    }


}
