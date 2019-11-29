package models;


import org.junit.Assert;
import org.junit.Test;


public class SneakerTest {
    @Test
    public void setNameTest(){
        //given
        String expected = "Chung";

        //when
        Sneakers testSneaker = new Sneakers();
        testSneaker.setName(expected);

        //thenA
        Assert.assertEquals(expected, testSneaker.getName());
    }
}
