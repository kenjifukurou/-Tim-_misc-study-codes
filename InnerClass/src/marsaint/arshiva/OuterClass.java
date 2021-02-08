package marsaint.arshiva;

public class OuterClass {

    private int outerX = 99;
    private String outerS = "I am Outer";
    private int x;
    private int y;

    public OuterClass(int outerX, String outerS, int x, int y) {
        this.outerX = outerX;
        this.outerS = outerS;
        this.x = x;
        this.y = y;
    }

    public int getOuterX() {
        return outerX;
    }

    public String getOuterS() {
        return outerS;
    }

    class InnerClass {

        private int innerY = 100;
        private String innerS = "I am Inner";

        public InnerClass(int innerY, String innerS) {
            this.innerY = innerY;
            this.innerS = innerS;
        }

        public int getInnerY() {
            return innerY;
        }

        public String getInnerS() {
            return innerS;
        }

        public int calculateSumOfOuter() {
            return (x + y) * outerX;
        }

    }
}
