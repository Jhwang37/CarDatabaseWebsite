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
        car = new Car("Audi", "R8", "2020", "$98,234", "13,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582922954/audi_jmacj0.jpg");
        carRepo.save(car);
        car = new Car("BMW", "M5", "2018", "$46,234", "99,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582916522/bmw_mxae4d.jpg");
        carRepo.save(car);
        car = new Car("Suburu", "Outback", "2017", "$33,324", "100,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582916522/suburu.jpb_jf1v88.jpg");
        carRepo.save(car);
        car = new Car("Tesla", "Model3", "2019", "$44,234", "45,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582923049/tsala_nby4tj.jpg");
        carRepo.save(car);
        car = new Car("Lexus", "LC500", "2019", "$89,234", "34,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582916522/2019-Lexus-LC500-_dkobcm.webp");
        carRepo.save(car);
        car = new Car("Range Rover", "Velar", "2019", "$56,234", "76,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582923173/https___blogs-images.forbes.com_nargessbanks_files_2017_08_2.-Range-Rover-Velar-First-Edition-1200x800_sabtxc.jpg");
        carRepo.save(car);
        car = new Car("Lamborhini", "Aventador", "2017", "$611,234", "29,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582922712/lambo_ba10ia.jpg");
        carRepo.save(car);
        car = new Car("Acura", "RDX", "2017", "$65,234", "29,000", "https://res.cloudinary.com/dbebbnxw/image/upload/v1582922954/acura_ai4ccj.webp");
        carRepo.save(car);

    }
}
