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
    @Test
    public void constructorTest(){
        //given
        Integer expectedId = 1;
        String expectedName = "Chung Arguello";
        String expectedBrand = "Chungalicious";
        String expectedSport = "Soccer";
        double expectedSize = 9.5;
        Integer expectedQty = 1000;
        double expectedPrice = 175.0;

        //when
        Sneakers sneaker = new Sneakers(expectedId, expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        Assert.assertEquals(expectedId, sneaker.getId());
        Assert.assertEquals(expectedName, sneaker.getName());
        Assert.assertEquals(expectedBrand, sneaker.getBrand());
        Assert.assertEquals(expectedSport, sneaker.getSport());
        Assert.assertEquals(expectedSize, sneaker.getSize(), 0);
        Assert.assertEquals(expectedQty, sneaker.getQty());
        Assert.assertEquals(expectedPrice, sneaker.getPrice(), 0);

    }
}
