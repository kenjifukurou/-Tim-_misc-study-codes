package marsaint.arshiva;

public class Main {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass(99, "I am Outer", 5, 5);
        System.out.println(outerClass.getOuterX());
        System.out.println(outerClass.getOuterS());

        OuterClass.InnerClass innerClass = outerClass.new InnerClass(55, "I am Inner");
        System.out.println(innerClass.getInnerY());
        System.out.println(innerClass.getInnerS());

        System.out.println(innerClass.calculateSumOfOuter());

    }
}
