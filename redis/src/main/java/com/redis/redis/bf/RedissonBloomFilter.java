package com.redis.redis.bf;

import io.micrometer.common.util.StringUtils;
import org.redisson.Redisson;
import org.redisson.api.RBloomFilter;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/*************************************************************************
 ******
 * - Copyright (c) 2023 shangzhao.com
 * - File Name: RedissonBloomFilter
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

public class RedissonBloomFilter {
    public static void main(String[] args) {

        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.97.121:6379");
        config.useSingleServer().setPassword("Sz@mypass123");
        //构造Redisson
        RedissonClient redisson = Redisson.create(config);

        RBloomFilter<String> bloomFilter = redisson.getBloomFilter("nameList");
        //初始化布隆过滤器：预计元素为100000000L,误差率为3%,根据这两个参数会计算出底层的bit数组大小
        bloomFilter.tryInit(100000000L, 0.03);
        //将zhuge插入到布隆过滤器中
        bloomFilter.add("zhuge");
        bloomFilter.add("guojia");

        //判断下面号码是否在布隆过滤器中
        System.out.println(bloomFilter.contains("guojia"));//false
        System.out.println(bloomFilter.contains("baiqi"));//false
        System.out.println(bloomFilter.contains("zhuge"));//true
    }

}