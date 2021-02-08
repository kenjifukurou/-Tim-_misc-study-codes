package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int clientAAge = 19;
        int clientBAge = 12;
        boolean isOver18 = (clientBAge >= 18) ? true : false;
        if (isOver18) {
            System.out.println("legal");
        } else {
            System.out.println("FBI incoming");
        }

        boolean fireAttack = true;
        int normalDamageOutput = 100;
        int finalDamageOutput = (fireAttack) ? (normalDamageOutput + 200) : (normalDamageOutput * 1);
        System.out.println(finalDamageOutput);
    }
}
