import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author BaiJY
 * @date 2022/08/16
 **/
public class Chapter2 {

    Runnable noArguments = () -> System.out.println("Hello World");

    //  BinaryOperator<Long> add = (x, y) -> x + y; 这是声明了一个函数，这个函数的类型是BinaryOperator<Long>
    // Lambda表达式的类型依赖于上下文环境，是由编译器推断出来的
    BinaryOperator<Long> add = (x, y) -> x + y;
    BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;


    //引用值而不是变量，既定事实上的final是指只能给变量赋值一次

    // 函数接口  只有一个抽象方法的接口，用作Lambda表达式的类型

    // java 开发工具包提供了一组核心函数接口

    // 类型推断

    Map<String, Integer> oldWordCounts = new HashMap<String, Integer>();
    Map<String, Integer> newWordCounts = new HashMap<>();

    Predicate<Integer> atLeast5 = x -> x > 5;

    // ***** Lambda表达式是一个匿名方法，将行为像数据一样进行传递




    public static void main(String[] args) {
        Function<Long, Long> add5 = x -> x + 5L;
        System.out.println(add5(10));

    }


}
