package design.interpreter;

/**
 * 优点：扩展性、灵活
 * 缺点：执行效率低、使用场景少、复杂语法难维护
 * 适用场景：可以将一个需要解释执行的语言中的句子表示为一个抽象语法树、重复出现的问题可以用一种简单的语言来进行表达
 * 总结：解释器模式可以处理脚本语言和编程语言。常用于解决某一特定类型的问题频繁发生情况
 * @author yangran
 * @create 2019/1/7
 */
public class Client {

    public static void main(String[] args) {
        String statement = "3 * 7 / 5 % 3 + 5";

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println(statement + " = " + result);
    }

}
