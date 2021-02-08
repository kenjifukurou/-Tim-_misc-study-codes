package com.company;

public class testMethodInterface {

    private String test;
    private testInterfaceX testInterface;

    public testMethodInterface(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public testInterfaceX getTestInterface() {
        return testInterface;
    }

    public void setTestInterface(testInterfaceX testInterface) {
        this.testInterface = testInterface;
        System.out.println("this should receive also testClassASum and testClassBMultiply");
    }


}
