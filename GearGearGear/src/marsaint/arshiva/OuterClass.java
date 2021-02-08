package marsaint.arshiva;

public class OuterClass {

    // class body
    private int thousand = 1000;

    public int getThousand() {
        return thousand;
    }

    public void setThousand(int thousand) {
        this.thousand = thousand;
    }

    //method
    public void getValue() {

        int multiply = 20;

        //local inner class
        class LocalInnerClass {
            private int xNum;
            private int yNum;

            public LocalInnerClass(int xNum, int yNum) {
                this.xNum = xNum;
                this.yNum = yNum;
            }

            public int getxNum() {
                return xNum;
            }

            public int getyNum() {
                return yNum;
            }

            private int calcXY() {
                System.out.println("calculate local inner class x + y");
                return (xNum + yNum) * multiply + getThousand();
            }
        }

        LocalInnerClass lIClass = new LocalInnerClass(20, 50);
        System.out.println(lIClass.calcXY());
    }
}
