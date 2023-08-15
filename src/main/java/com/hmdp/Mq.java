package com.hmdp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class Mq {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
//    public void test(){
//        while(true){
//            Object msg = stringRedisTemplate.execute("XREAD COUNT 1 BLOCK 2000 STREAMS users $");
//            if (msg == null){
//                continue;
//            }
//            handleMessage(msg);
//        }
//    }
}
