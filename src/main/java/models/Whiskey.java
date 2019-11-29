package models;

public class Whiskey {
    private Integer id;
    private String brand;

    public Whiskey(){

    }
    public Whiskey(Integer id, String brand){
        this.id = id;
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
