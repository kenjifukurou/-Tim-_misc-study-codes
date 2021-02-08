package marsaint.arshiva;

public class Phone implements ITelephone {

    private int myNumber = 9999999;
    private boolean isRinging;

    @Override
    public void powerOn() {
        System.out.println("Phone powered on");
    }

    @Override
    public void callIn(int phoneNumber) {
        System.out.println("incoming call, phone number: " + phoneNumber);
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("answer phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callOut(int phoneNumber) {
        if (phoneNumber != myNumber) {
            System.out.println("calling: " + phoneNumber + "...");
            return true;
        }
        System.out.println("cannot call self number");
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
