package com.code;

import org.junit.Assert;
import org.junit.Test;
import org.apache.commons.lang3.StringUtils;
/**
 * Created by GURDIT_SINGH on 16-05-2015.
 */
public class SwapCharCaseTest {

    @Test
    public void test(){
        Assert.assertEquals("hello",StringUtils.swapCase("HELLO"));
    }
}
