package marsaint.arshiva;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn;
    private int batteryPower = 100;

    //constructor
    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    @Override
    public void powerOn() {
        if (batteryPower <=0) {
            System.out.println("battery power too low, shutting down...");
            isOn = false;
        }
        System.out.println("mobile phone is on");
        isOn = true;
    }

    @Override
    public void callIn(int phoneNumber) {
        if (isOn) {
            System.out.println("receiving phone call: " + phoneNumber);
            isRinging();
        }
        System.out.println("phone is switched off");
    }

    @Override
    public void answer() {

    }

    @Override
    public boolean callOut(int phoneNumber) {
        return false;
    }

    @Override
    public boolean isRinging() {
        System.out.println("ring...ring...ring...");
        return false;
    }
}
