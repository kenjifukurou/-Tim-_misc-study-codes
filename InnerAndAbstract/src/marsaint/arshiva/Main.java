package marsaint.arshiva;

interface Topic_I {
    void methodA();
    void methodB();
    void methodC();
}

class TopicX implements Topic_I {

    @Override
    public void methodA() {
        System.out.println("method XA");
    }

    @Override
    public void methodB() {
        System.out.println("method XB");
    }

    @Override
    public void methodC() {
        System.out.println("method XC");
    }
}

class TopicY implements Topic_I {
    @Override
    public void methodA() {
        System.out.println("method YA");
    }

    @Override
    public void methodB() {
        System.out.println("method YB");
    }

    @Override
    public void methodC() {
        System.out.println("method YC");
    }
}

public class Main {

    public static void main(String[] args) {

        Topic_I myTopicX = new TopicX();
        myTopicX.methodA();
        myTopicX.methodB();
        myTopicX.methodC();

        Topic_I myTopicY = new TopicY();
        myTopicY.methodA();
        myTopicY.methodB();
        myTopicY.methodC();

    }
}
