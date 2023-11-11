package com.nowcoder.community;

import com.nowcoder.community.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description:
 * @author: JiangH
 * @time: 2023/11/10 21:29
 */
@SpringBootTest
public class TransactionTest {

    @Autowired
    private TestService testService;

    @Test
    public void testSave1(){
        Object obj = testService.save1();
        System.out.println(obj);
    }
    @Test
    public void testSave2(){
        Object obj = testService.save2();
        System.out.println(obj);
    }
}
