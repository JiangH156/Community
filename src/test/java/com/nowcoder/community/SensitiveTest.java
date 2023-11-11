package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @description:
 * @author: JiangH
 * @time: 2023/11/8 22:51
 */
@SpringBootTest
public class SensitiveTest {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter(){
        String text = "这里可以♥赌♥博♥，可以♥嫖♥娼♥，可以♥吸♥毒♥，可以♥开♥票♥，hhhh!";
        String result = sensitiveFilter.filter(text);
        System.out.println(result);
    }
}
