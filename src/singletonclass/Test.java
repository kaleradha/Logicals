package singletonclass;

public class Test {
    private static Test test=null;

    private  Test(){
        System.out.println("This is the construcor of the object");
    }
    public static  Test getInstance() {
        if (test == null) {
            return test = new Test();
        }else{
            return test;
        }

    }

    public static void main(String[] args) {
        Test t= Test.getInstance();
        System.out.println(t.hashCode());
        Test t2=Test.getInstance();
        System.out.println(t2.hashCode());
    }
}
