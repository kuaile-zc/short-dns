package com.zc.project.dns.utils;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * @author corey
 * @creat 2022/5/3 16:28
 * @describe TODO
 */
public class UtilsTest {

    @Test
    public void addTest() {
        Assertions.assertEquals(Utils.add(1,2), 3);
    }
}
