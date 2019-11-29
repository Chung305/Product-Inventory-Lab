package services;

import models.Whiskey;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WhiskeyServiceTest {
    @Test
    public void createtest(){
        //given
        String expectedBrand = "Bulleit";

        //when
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey whiskey = whiskeyService.create(expectedBrand );

        // (3)
        String actual = whiskey.getBrand();

        //then
        Assert.assertEquals(expectedBrand, actual);

    }
    @Test
    public void atestDelete(){

        Boolean expected = true;

        //when
        WhiskeyService whiskeyService = new WhiskeyService();
        whiskeyService.create("Bulleit");
        whiskeyService.create("Makers Mark");

        Assert.assertEquals(expected, whiskeyService.delete(1));

    }

    @Test
    public void findWhiskeyTest(){
        //given
        String expectedBrand = "Bulleit";

        //when
        WhiskeyService whiskeyServices = new WhiskeyService();
        Whiskey whiskey = whiskeyServices.create(expectedBrand );

        //then
        Assert.assertEquals(whiskey, whiskeyServices.findWhiskey(1));
    }

    @Test
    public void findAllTest(){
        String expectedBrand = "Bulleit";

        //when
        WhiskeyService whiskeyService = new WhiskeyService();
        Whiskey whiskey = whiskeyService.create(expectedBrand );
        Whiskey[] inventory = {whiskey};

        //then
        Assert.assertEquals(inventory, whiskeyService.findAll());
    }


}
