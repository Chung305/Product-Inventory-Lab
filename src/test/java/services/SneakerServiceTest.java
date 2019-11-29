package services;

import models.Sneakers;
import org.junit.Assert;
import org.junit.Test;

public class SneakerServiceTest {
    @Test
    public void createtest(){
        //given
        String expectedName = "Chung Arguello";
        String expectedBrand = "Chungalicious";
        String expectedSport = "Soccer";
        double expectedSize = 9.5;
        Integer expectedQty = 1000;
        double expectedPrice = 175.0;

        //when
        SneakerService sneakerService = new SneakerService();
        Sneakers testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        // (3)
        int actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        double actualSize = testSneaker.getSize();
        Integer actualQty = testSneaker.getQty();
        double actualPrice = testSneaker.getPrice();

        //then
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedSport, actualSport);
        Assert.assertEquals(expectedSize, actualSize, 0);
        Assert.assertEquals(expectedQty, actualQty);
        Assert.assertEquals(expectedPrice, actualPrice, 0);

    }

    @Test
    public void findSneakerTest(){
        //given
        String expectedName = "Chung Arguello";
        String expectedBrand = "Chungalicious";
        String expectedSport = "Soccer";
        double expectedSize = 9.5;
        Integer expectedQty = 1000;
        double expectedPrice = 175.0;

        //when
        SneakerService sneakerService = new SneakerService();
        Sneakers testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        Sneakers actual = sneakerService.findSneaker(1);

        Assert.assertEquals(testSneaker, actual);
    }

    @Test
    public void findAllTest(){
        //given
        String expectedName = "Chung Arguello";
        String expectedBrand = "Chungalicious";
        String expectedSport = "Soccer";
        double expectedSize = 9.5;
        Integer expectedQty = 1000;
        double expectedPrice = 175.0;

        //when
        SneakerService sneakerService = new SneakerService();
        Sneakers testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);
        Sneakers[] expected = {testSneaker};

        //then
        Assert.assertEquals(expected, sneakerService.findAll());
    }

    @Test
    public void deleteTest(){
        //given
        Boolean expected = true;
        SneakerService sneakerService = new SneakerService();

        //when
        sneakerService.create("chung", "nike", "Soccer", 9.5, 10, 100.0);
        sneakerService.create("chungster", "Puma", "Soccer", 8.5, 10, 150.0);
        sneakerService.create("chungy", "nike", "Soccer", 9.0, 10, 120.0);

        //then
        Assert.assertEquals(expected, sneakerService.delete(1));
        Assert.assertEquals(2, sneakerService.findAll().length);
        sneakerService.delete(2);
        Assert.assertEquals(1, sneakerService.findAll().length);



    }

}
