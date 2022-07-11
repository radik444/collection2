import java.util.*;
import java.util.function.Consumer;

public class Main {

    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
        doTask4();

    }


    //Задание 1
    private static void doTask1() {
        List<Integer> nums = generate(20);
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
    }

    //Задание 2

    private static void doTask2() {
        List<Integer> nums = generate(20);
        Set<Integer > result = new TreeSet<>(nums);
        for (Integer num : result) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }



    private static List<Integer> generate(int n) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(RANDOM.nextInt(5));
        }
        System.out.println("Сген.числа" + list);
        return list;
    }

    //Задание 3
     private static void doTask3() {
        List<String> words = List.of("test1","test2","test3","test4","test532","test532","test1");
        Set<String > result = new HashSet<>(words);
        System.out.println(result);
    }


    //Задание 4
     private static void doTask4() {
        List<String> words = List.of("test1","test2","test3","test4","test532","test532","test1");
        Map<String,Integer> result = new HashMap<>();
        for ( String word : words) {
            if (result.containsKey(word)){
                result.put(word, result.get(word)+1);
            }else {
                result.put(word,1);
            }
        }
        System.out.println(result);
    }




}
