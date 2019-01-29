package design.template;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复
 * 一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现
 * @author yangran
 * @create 2019/1/28
 */
public class CacheTemplate<K, V> {

    private ConcurrentHashMap<K,V> dataMap = new ConcurrentHashMap<K, V>();

    public V get(K key){
        return dataMap.get(key);
    }

    public void put(K key,V value) {
        dataMap.put(key, value);
    }

    public <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}
