package com.shnu.work;

import com.google.gson.Gson;
import com.shnu.work.util.RandomLocationUtils;
import com.shnu.work.util.RedisUtils;
import com.spoon.pass.encrypt.EncryptDecrypt;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class WorkApplicationTests {

    @Autowired
    RedisUtils redisUtils;

    Gson gson = new Gson();

    @Test
    void contextLoads() {

    }

    @Test
    public void testEncrypt() {
        String ENCRYPT_KEY = "developedByTongHao";
        String encrypt = EncryptDecrypt.encrypt("123456", ENCRYPT_KEY);
        System.out.println("encrypt = " + encrypt);
        String decrypt = EncryptDecrypt.decrypt(encrypt, ENCRYPT_KEY);
        System.out.println("decrypt = " + decrypt);
    }

    @Test
    public void testRedis() {
        boolean set = redisUtils.set("kkk", "vvv");
        System.out.println("set = " + set);
    }

    @Test
    public void testRandomLocationUtils() {
        Map<String, String> jw = RandomLocationUtils.randomLonLat(85, 122, 29, 116);
        System.out.println("jw = " + jw);
    }
}
