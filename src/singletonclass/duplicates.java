package singletonclass;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class duplicates {
    public static void main(String[] args) {
        int []a={1,2,3,4,6,8,12,43};
      //  Arrays.stream(a).distinct().forEach(System.out::println);
      //  int asInt = Arrays.stream(a).filter(e -> e % 2 == 0).findAny().getAsInt();
//System.out.println(asInt);
//Arrays.stream(a).filter(e->e==0).skip(3).limit();
Arrays.stream(a).skip(4).limit(4).forEach(System.out::println);


    }
}
