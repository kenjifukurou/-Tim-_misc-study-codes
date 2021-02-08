package com.company;

public class testClassBMultiply implements testInterfaceX {

    private int secretField;

    @Override
    public int calcXY(int x, int y) {
        return x * y;
    }

    public int getSecretField() {
        return secretField;
    }
}
