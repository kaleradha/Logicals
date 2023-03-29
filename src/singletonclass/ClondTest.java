package singletonclass;

public class ClondTest implements Cloneable{
    int i=40;int j=44;

    public static void main(String[] args) throws CloneNotSupportedException {
        ClondTest cloneable=new ClondTest();
        ClondTest clone = (ClondTest) cloneable.clone();
        clone.i=444;
        clone.j=555;
        System.out.println(cloneable.i+"-----------"+cloneable.j);
        System.out.println(clone.i+"------------"+ clone.j);


    }
}
