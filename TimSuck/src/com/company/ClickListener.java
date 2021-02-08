package com.company;

public class ClickListener implements OnClickListener {

    public ClickListener() {
        System.out.println("click listener constructed");
    }

    @Override
    public void IonClick(String title) {
        // implement whats OnClickListener do
        System.out.println("ClickListener implemented OnClickListener, " +
                "called by Button, receive title parameter");

        System.out.println(title + " was clicked");

    }
}
