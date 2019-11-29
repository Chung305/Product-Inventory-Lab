package services;

import models.Sneakers;
import models.Whiskey;

import java.util.ArrayList;

public class WhiskeyService {
    private static Integer nextId = 1;
    private ArrayList<Whiskey> inventory = new ArrayList<>();

    public Whiskey create(String brand){

        Whiskey  createWhiskey = new Whiskey(nextId++, brand);

        inventory.add(createWhiskey);

        return createWhiskey;
    }

    public Whiskey findWhiskey(Integer id){
//        for(Whiskey each : inventory){
//            if(each.getId().equals(id))
//                return each;
//        }
        return inventory.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
    }

    public Whiskey[] findAll(){
        return inventory.toArray(new Whiskey[0]);
    }

    public Boolean delete(int id){
        for(Whiskey each: inventory){
            if(each.getId().equals(id)){
                return inventory.remove(each);
            }
        }
        return false;
    }

}
