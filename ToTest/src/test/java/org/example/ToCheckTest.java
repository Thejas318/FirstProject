package org.example;

import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.Test;



class ToCheckTest {
    ToCheck c = null;

    @Before
    public void before()
    {
        c = new ToCheck();
    }


    @Test
    public  void oddTest()
    {

        Assert.assertTrue(c.odd("Thejas"));
    }
}