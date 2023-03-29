package singletonclass;

public class inst {


static int f=30;
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    public static void main(String[] args) {

        inst tst = new inst();
    }
        }

