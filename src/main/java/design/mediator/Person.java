package design.mediator;

/**
 * 抽象同事类——明确自己的行为与中介者联系
 * @author yangran
 * @create 2019/3/4
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    Person(String name,Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

}
