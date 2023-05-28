package ru.inno.course.calculator;

import java.util.*;



public class MyCalculator implements Calculator{

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public double div(int a, int b) {
        return (double) a/b;
    }

   @Override

    public double avg(Collection<Integer> numbers) {

        double sum = 0;

        for (Integer integer : numbers) {
            sum += integer;
        }

        return sum/numbers.size();
    }



    @Override
    public int min(Collection<Integer> numbers) {

        return Collections.min(numbers);
    }


    @Override
    public int max(Collection<Integer> numbers) {

        return Collections.max(numbers);
    }

}
