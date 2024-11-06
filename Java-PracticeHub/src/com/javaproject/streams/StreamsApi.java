package com.javaproject.streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApi {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList( 5,3,4,1,10,4,1);
        List<Integer> list2 = Arrays.asList(11,2,3,210,300,1,10);
        System.out.println("Before filtering");

        List<Integer> list = numbers.stream()
                .filter(n ->{
                    System.out.println("Filtering " + n);
                    return n > 2;
                }
                )
                .map(n -> {
                    System.out.println("Mapping " + n);
                    return n*2;
                }).sorted().toList();

        System.out.println("After filtering"+list);

        List<Integer>resultList=list2.stream().filter(n -> n > 2).sorted().toList();
        System.out.println("After filtering"+ resultList);


    }


}
