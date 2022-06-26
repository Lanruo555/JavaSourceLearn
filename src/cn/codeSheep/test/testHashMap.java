package cn.codeSheep.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lan
 * @Date: 2022/6/7 23:19
 * @description: HashMap源码解读分析和注释
 */
public class testHashMap {
    public static void main(String[] args) {
        Map<String,Double> hashMap = new HashMap<>();

        hashMap.put( "k1", 0.1 );
        hashMap.put( "k2", 0.2 );
        hashMap.put( "k3", 0.3 );
        hashMap.put( "k4", 0.4 );

        for ( Map.Entry<String,Double> entry : hashMap.entrySet() ) {
            System.out.println( entry.getKey() +"：" + entry.getValue());
        }
    }
}
