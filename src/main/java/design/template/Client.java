package design.template;

import java.util.Date;

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

        CacheTemplate<String,Date> cacheTemplate1 = new CacheTemplate<String,Date>();
        cacheTemplate1.put("now",new Date());
        Long now = cacheTemplate1.get("now").getTime();
        System.out.println(now);
    }

}
