package services;

import models.Sneakers;

import java.util.ArrayList;

public class SneakerService {

    private Integer nextId = 1;
    private ArrayList<Sneakers> inventory = new ArrayList<>();

    public Sneakers create(String name, String brand, String sport, double size, Integer qty, double price){

        Sneakers  createSneaker = new Sneakers(nextId++, name, brand, sport, size, qty, price);

        inventory.add(createSneaker);

        return createSneaker;
    }

    public Sneakers findSneaker(Integer id){
        return inventory.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
    }

    public Sneakers[] findAll(){
        return inventory.toArray(new Sneakers[0]);
    }

    public Boolean delete(int id){
        return inventory.remove(findSneaker(id));
    }



}
