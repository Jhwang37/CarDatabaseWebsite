package com.example.carlisting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository carRepo;
    @Autowired
    CategoryRepository categoryRepo;


    @Override
    public void run(String ... strings) throws Exception{
        Category category;
        category = new Category("SUV");
        categoryRepo.save(category);
        category = new Category("MiniVan");
        categoryRepo.save(category);
        category = new Category("Coupe");
        categoryRepo.save(category);
        category = new Category("Sedan");
        categoryRepo.save(category);
        category = new Category("Hybrid");
        categoryRepo.save(category);
        category = new Category("Convertible");
        categoryRepo.save(category);
        category = new Category("Truck");
        categoryRepo.save(category);

        Car car;
        car = new Car("Honda", "Civic", "2014", "$23,234", "120,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582916522/Honda_v2ddez.jpg");
        carRepo.save(car);
        car = new Car("BMW", "M5", "2018", "46,234", "99,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582916522/bmw_mxae4d.jpg");
        carRepo.save(car);
        car = new Car("Suburu", "Outback", "2017", "33,324", "100,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582916522/suburu.jpb_jf1v88.jpg");
        carRepo.save(car);
        car = new Car("Tesla", "Model3", "2019", "44,234", "45,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582916522/tesa_u6m8hp.webp");
        carRepo.save(car);
        car = new Car("Lexus", "LC500", "2019", "89,234", "34,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582916522/2019-Lexus-LC500-_dkobcm.webp");
        carRepo.save(car);
        car = new Car("Toyota", "Rav4", "2019", "32,234", "29,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582916522/2019toyotarav4_feat-382x238-c_ooqhnv.jpg");
        carRepo.save(car);

    }
}
