package com.ap.Interfaces.Exm2;

public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        System.out.println();
        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}
