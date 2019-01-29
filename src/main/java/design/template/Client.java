package design.template;

/**
 * @author yangran
 * @create 2019/1/28
 */
public class Client {

    public static void main(String[] args) {
        StringCacheTemplate cacheTemplate = new StringCacheTemplate();
        cacheTemplate.put("a","Hello World");
        String str = cacheTemplate.get("a");
        System.out.println(str);
    }

}
