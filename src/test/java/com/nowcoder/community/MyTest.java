package com.nowcoder.community;

import com.nowcoder.community.util.CommunityUtil;
import org.junit.jupiter.api.Test;

public class MyTest {

    @Test
    public void test1() {
        String s = CommunityUtil.generateUUID();
        System.out.println(s);
    }
}
