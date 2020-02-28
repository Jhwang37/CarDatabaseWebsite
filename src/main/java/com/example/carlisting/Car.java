package com.example.carlisting;

import javax.persistence.*;

@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String carMake;
    private String carModel;
    private String carYear;
    private String MSRP;
    private String mileage;

    private String image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
    public Car(){

    }


    public Car(String carMake, String carModel,String carYear,String MSRP,String mileage
               , String image){
        this.carMake = carMake;
        this.carModel = carModel;
        this.carYear = carYear;
        this.MSRP = MSRP;
        this.mileage = mileage;
        this.image = image;
        this.category = category;


    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public String getMSRP() {
        return MSRP;
    }

    public void setMSRP(String MSRP) {
        this.MSRP = MSRP;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }



    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
