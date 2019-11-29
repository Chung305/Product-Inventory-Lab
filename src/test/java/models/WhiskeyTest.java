package models;

import org.junit.Assert;
import org.junit.Test;

public class WhiskeyTest {
    @Test
    public void setNameTest(){
        //given
        String expected = "Chung";

        //when
        Whiskey whiskey = new Whiskey();
        whiskey.setBrand(expected);

        //thenA
        Assert.assertEquals(expected, whiskey.getBrand());
    }


    @Test
    public void contstructorTest() {
        //given
        Integer expectedId = 1;
        String expectedBrand = "Bulleit";


        Whiskey whiskey = new Whiskey(expectedId, expectedBrand);

        Assert.assertEquals(expectedId, whiskey.getId());
        Assert.assertEquals(expectedBrand, whiskey.getBrand());
    }
}
