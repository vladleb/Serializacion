package Java8Test;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        UserFactory userFactory = User::new;
//        User user = userFactory.create("John", "Snow");
//
//        Function<String, Integer> toInteger = Integer::valueOf;
//        Function<Integer,String> fromIntegerToString = String::valueOf;
//        Function<String, String> backToString = toInteger.andThen(fromIntegerToString);
//
//
//        System.out.println(backToString.apply("123"));
//
//        Supplier<LocalDateTime> now = LocalDateTime::now;
//        System.out.println(now.get());
//
//
//        StringJoiner joiner = new StringJoiner(".", "prefix-", "-suffix");
//        for (String s : "Hello the brave world".split(" ")) {
//            joiner.add(s);
//        }
//        System.out.println(joiner); //prefix-Hello.the.brave.world-suffix\

        int [] test = {1,2,3,4,5,6,1};
        Set <Integer> testSet = new HashSet<>();
        for(int i = 0; i < test.length; i++)
            testSet.add(test[i]);

        System.out.println(test.length);
        System.out.println(testSet.size());

        System.out.println(test.length == testSet.size());

        String hello = "Hello world man vlad";
        List<String> gg = Arrays.stream(hello.split(" ")).collect(Collectors.toList());
        String[] a = gg.toArray(new String[0]);
        System.out.println(Arrays.toString(a));
        System.out.println();

    }


}
