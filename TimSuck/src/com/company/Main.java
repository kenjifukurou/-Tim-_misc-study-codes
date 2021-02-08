package com.company;

public class Main {

    public static void main(String[] args) {

//        testInterfaceX Isum = new testClassASum();
//        System.out.println(Isum.calcXY(10, 10));
//
//        testInterfaceX Imultiply = new testClassBMultiply();
//        System.out.println(Imultiply.calcXY(10, 10));
//
//        System.out.println(power(Isum, 10, 10));
//        System.out.println(power(Imultiply, 10, 10));
//
////        System.out.println("answer: " +
////                "accept 'class' but because go through by interface, " +
////                "can only use interface's methods");
//
//        testMethodInterface testMethod = new testMethodInterface("testing interface method");
//        testClassASum classSum = new testClassASum();
//        testClassBMultiply classMultiply = new testClassBMultiply();
//
//        testMethod.setTestInterface(classSum);
//        System.out.println(testMethod.getTestInterface().calcXY(20, 20));

//        Button xButton = new Button("TheBuTTon~~");
//        OnClickListener clickListener = new ClickListener();
//        xButton.setOnClickListener(clickListener);
//
//        xButton.buttonOnClick();

        Button btn = new Button("StartButton");
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void IonClick(String title) {
                System.out.println(title + " clicked");
            }
        });

        OnClickListener anonymousInterface = new OnClickListener() {
            @Override
            public void IonClick(String title) {
                System.out.println(title + " anonymousObject");
            }
        };

        OnClickListener anonymousClass = new ClickListener() {
            @Override
            public void IonClick(String title) {
                System.out.println(title + " anonymousClick");
            }
        };

        btn.buttonOnClick();

        anonymousInterface.IonClick("title2");
        anonymousClass.IonClick("title3");

    }

//    public static int power(testInterfaceX acceptInterfaceOrBothTest, int x, int y) {
//        return acceptInterfaceOrBothTest.calcXY(x, y) * acceptInterfaceOrBothTest.calcXY(x, y);
//    }
}
