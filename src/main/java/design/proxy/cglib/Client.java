package design.proxy.cglib;

/**
 * 针对类做代理使用的是Cglib
 * Cglib是一个强大的、高性能的代码生成包，它广泛被许多AOP框架使用，为他们提供方法的拦截
 * @author yangran
 * @create 2019/1/13
 */
public class Client {
    public static void main(String[] args) {
        BookFacadeImpl1 bookFacadeImpl1 = new BookFacadeImpl1();
        BookFacadeCglib cglib = new BookFacadeCglib();
        BookFacadeImpl1 proxy = (BookFacadeImpl1)cglib.getInstance(bookFacadeImpl1);
        proxy.addBook();
    }
}
