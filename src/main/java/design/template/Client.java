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

        Integer i01 = 59;
        int i02 = 59;
        Integer i03 =Integer.valueOf(59);   //-128到127有缓存。是同一个对象
        Integer i04 = new Integer(59);
        Integer i05 = new Integer(59);

        System.out.println(i01==i02);
        System.out.println(i01==i03);
        System.out.println(i01==i04);
        System.out.println(i03==i04);
        System.out.println(i02==i03);
        System.out.println(i02==i04);
        System.out.println(i03==i05);
    }

}
