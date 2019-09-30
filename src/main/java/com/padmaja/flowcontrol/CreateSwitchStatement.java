package com.padmaja.flowcontrol;

public class CreateSwitchStatement {
    public int getRankBaseOfScore(int marks) {
        marks =20;
        switch (marks) {
            case 10:
                System.out.println(10);
            break;
            case 20:
                System.out.println(20);
            break;
            case 30:
                System.out.println(30);
            break;
            default:
                System.out.println("default");
                break;
        }
        return marks;
    }
}