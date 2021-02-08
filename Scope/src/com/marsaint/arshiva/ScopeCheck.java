package com.marsaint.arshiva;

public class ScopeCheck {

    int privateInt = 0;

    public void loopInt() {
        for (int i=0; i<10; i++) {
            privateInt += 1;
        }
    }

}
