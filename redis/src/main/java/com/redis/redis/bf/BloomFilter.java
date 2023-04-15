package com.redis.redis.bf;

/*************************************************************************
 ******
 * - Copyright (c) 2023 shangzhao.com
 * - File Name: BloomFilter
 * - @Author: WangJiLIn
 * - Description:
 * 接⼝描述
 * - Functions:
 *
 * - History:
 * Date        Author          Modification
 * 2023/4/3   WangJiLin     Create the current class
 *************************************************************************
 ******/
public class BloomFilter {
//        //初始化布隆过滤器
//        RBloomFilter<String> bloomFilter = redisson.getBloomFilter("nameList");
//        //初始化布隆过滤器：预计元素为100000000L,误差率为3%
//        bloomFilter.tryInit(100000000L, 0.03);
//
//        //把所有数据存入布隆过滤器
//        void init () {
//            for (String key : keys) {
//                bloomFilter.put(key);
//            }
//        }
//
//        String get (String key){
//            // 从布隆过滤器这一级缓存判断下key是否存在
//            Boolean exist = bloomFilter.contains(key);
//            if (!exist) {
//                return "";
//            }
//            // 从缓存中获取数据
//            String cacheValue = cache.get(key);
//            // 缓存为空
//            if (StringUtils.isBlank(cacheValue)) {
//                // 从存储中获取
//                String storageValue = storage.get(key);
//                cache.set(key, storageValue);
//                // 如果存储数据为空， 需要设置一个过期时间(300秒)
//                if (storageValue == null) {
//                    cache.expire(key, 60 * 5);
//                }
//                return storageValue;
//            } else {
//                // 缓存非空
//                return cacheValue;
//            }
//        }

}
