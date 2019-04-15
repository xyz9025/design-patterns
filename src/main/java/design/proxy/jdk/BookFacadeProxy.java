package design.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yangran
 * @create 2019/1/13
 */
public class BookFacadeProxy implements InvocationHandler {

    private Object target;//这其实业务实现类对象，用来调用具体的业务方法

    public Object bind(Object target) {
        this.target = target;  //接收业务实现类对象参数

        //通过反射机制，创建一个代理类对象实例并返回。用户进行方法调用时使用
        //创建代理对象时，需要传递该业务类的类加载器（用来获取业务实现类的元数据，在包装方法是调用真正的业务方法）、接口、handler实现类
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    /**
     *
     * @param proxy   代理类
     * @param method  被代理方法
     * @param args    方法的参数数组
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("预处理操作——————");
        //调用真正的业务方法
        Object result=method.invoke(target, args);

        System.out.println("调用后处理——————");
        return result;
    }
}
