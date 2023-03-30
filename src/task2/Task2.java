package task2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;


//Створити список та заповнити рандомними числами 10 осередків, потрібно вивести суму квадратів усіх елементів списку.
// Ми використовуємо метод map()
// для зведення квадрат кожного елемента, а потім застосовуємо метод reduce() для згортки всіх елементів в одне число.
public class Task2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int s = list.stream()
                .mapToInt(num -> (int) Math.pow(num, 2))
                .reduce(0, Integer::sum);
        System.out.println(s);

        //2
        int s2 = list.stream()
                .mapToInt(x -> x * x)
                .reduce(0, Integer::sum);
        System.out.println(s2);

        int sum = IntStream.generate(() -> randomInt(1, 20))
                .limit(10)
                .peek(n -> System.out.println("Number: " + n))
                .map(n -> (int) Math.pow(n, 2))
                .peek(pow -> System.out.println("Number * number: " + pow))
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }

    private static int randomInt(int from, int to) {
        Random random = new Random();
        return random.nextInt(to - from) + 1;
    }
}

