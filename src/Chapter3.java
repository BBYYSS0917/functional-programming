import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author BaiJY
 * @date 2022/08/16
 **/
public class Chapter3 {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        int count = 0;

        //从外部迭代到内部迭代
        // 外部迭代处在应用代码和集合代码不断的跳转中
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String str = iterator.next();
//            System.out.println(str);
//            count++;
//            System.out.println(count);
//        }

//        System.out.println(list.stream().count());

        // Stream 的惰性求值和及早求值
        //collect(toList())

//        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        List<String> collected = Stream.of("a", "b", "c").map(string -> string.toUpperCase()).collect(Collectors.toList());
        collected.forEach(s->System.out.println(s));

        List<String> beginningWithNumbers =Stream.of("a","b","1c").filter(value->isDigit(value.charAt(0))).collect(Collectors.toList());

        // flatmap 多个流合成一个流
//        List<Integer> together = Stream.of(asList(1, 2), asList(3, 4)).flatMap(numbers -> numbers.stream()).collect(toList());

        // max min
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
        Integer minNum = numList.stream().min(Comparator.comparing(num->num.intValue())).get();

        System.out.println(minNum);

        // reduce
        int totalNum = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);

        // 整合操作


    }

    public static boolean isDigit(Character c) {
        return false;
    }

}
