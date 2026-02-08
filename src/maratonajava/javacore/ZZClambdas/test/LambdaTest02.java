package maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    static void main(String[] args) {
        List<String> strings = List.of("Luffy","Goku","Naruto","Ichigo");
        System.out.println(returnLength(strings,String::length));
        System.out.println(returnLength(strings,String::toUpperCase));


    }
    private static <T,R> List<R> returnLength(List<T> listT, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T i : listT){
            R apply = function.apply(i);
            result.add(apply);
        }
        return result;



    }

}
