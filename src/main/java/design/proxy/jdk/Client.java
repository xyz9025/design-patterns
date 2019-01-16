package design.proxy.jdk;

/**
 * 针对接口做代理默认使用的是JDK自带的Proxy+InvocationHandler
 * @author yangran
 * @create 2019/1/13
 */
public class Client {
    public static void main(String[] args) {
        BookFacade bookFacade = new BookFacadeImpl();
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacade facade = (BookFacade) proxy.bind(bookFacade);
        facade.addBook();
    }
}
