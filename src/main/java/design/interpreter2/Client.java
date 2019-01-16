package design.interpreter2;

/**
 * @author yangran
 * @create 2019/1/8
 */
public class Client {
    public static void main(String[] args) {
        String statement = "3万9千5百7十9";

        Calculator calculator = new Calculator();

        calculator.build(statement);

        int result = calculator.compute();

        System.out.println(statement + " = " + result);
    }
}
