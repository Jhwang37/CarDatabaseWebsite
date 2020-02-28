package com.example.carlisting;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String categoryname;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Car> cars;

    public Category() {
    }
    public Category(String categoryname){
        this.categoryname = categoryname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }
}
