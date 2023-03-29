package singletonclass;

public class car {

    private static car c ;

    private car() {

    }

    private static car getInstance() {
        if (c == null) {
            c = new car();
        }
            return c;
        }

        public static void main (String[]args){
            car c1 = car.getInstance();

            car c2 =  car.getInstance();
            System.out.println(c2.hashCode());
            System.out.println(c1.hashCode());
            System.out.println(c1.equals(c2));
        }

}