package marsaint.arshiva;

public interface ITelephone {

    void powerOn();
    void callIn(int phoneNumber);
    void answer();
    boolean callOut(int phoneNumber);
    boolean isRinging();
}
