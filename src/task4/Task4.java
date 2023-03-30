package task4;

import java.util.function.BiFunction;

//Напишіть основні арифметичні дії калькулятора, використовуючи лямбда-вирази
public class Task4 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> summarizer = Integer::sum;
        BiFunction<Integer, Integer, Integer> subtract = (n1, n2) -> n1 - n2;
        BiFunction<Integer, Integer, Long> multiplier = (n1, n2) -> (long) n1 * n2;
        BiFunction<Integer, Integer, Double> divider = (n1, n2) -> (double) n1 / n2;

        System.out.println(summarizer.apply(20, 10));
        System.out.println(subtract.apply(20, 10));
        System.out.println(multiplier.apply(20, 10));
        System.out.println(divider.apply(20, 10));
    }
}


