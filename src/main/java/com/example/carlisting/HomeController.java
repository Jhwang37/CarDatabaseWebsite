package com.example.carlisting;

import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    CategoryRepository categoryRepo;
    @Autowired
    CarRepository carRepo;
    @Autowired
    CloudinaryConfig cloudC;

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("categories", categoryRepo.findAll());
        model.addAttribute("cars", carRepo.findAll());
        return "index";
    }

    @GetMapping("/addcar")
    public String addCar(Model model){
        model.addAttribute("categories", categoryRepo.findAll());
        model.addAttribute("car", new Car());
        return "carform";
    }
    @PostMapping("/processcar")
    public String processCar(Car car, @RequestParam("file") MultipartFile file) {
        try {
            Map uploadResult = cloudC.upload(file.getBytes(),
                    ObjectUtils.asMap("resourcetype", "auto"));
            car.setImage(uploadResult.get("url").toString());
            carRepo.save(car);
        } catch (IOException e) {
            e.printStackTrace();
            return "redirect:/addcar";
        }
        return "redirect:/";
    }
    @GetMapping("/addcategory")
    public String addCategory(Model model){
        model.addAttribute("category", new Category());
        return "categoryform";
    }
    @PostMapping("/processcategory")
    public String processCategory(Category category){
        categoryRepo.save(category);
        return "redirect:/";
    }

    @RequestMapping("/updatecategory/{id}")
    public String updatecategory(@PathVariable("id") long id, Model model){
        model.addAttribute("category", categoryRepo.findById(id).get());
        return "categoryform";
    }
    @RequestMapping("/deletecategory/{id}")
    public String delCategory(@PathVariable("id") long id){
        categoryRepo.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping("/detail/{id}")
    public String showCar(@PathVariable("id") long id, Model model){
        model.addAttribute("car", carRepo.findById(id).get());
        return "show";
    }
    @RequestMapping("/update/{id}")
    public String updateCar(@PathVariable("id") long id, Model model){
        model.addAttribute("categories", categoryRepo.findAll());
        model.addAttribute("car", carRepo.findById(id).get());
        return "carform";
    }
    @RequestMapping("/delete/{id}")
    public String delCar(@PathVariable("id") long id){
        carRepo.deleteById(id);
        return "redirect:/";
    }
    @RequestMapping("/category/{id}")
    public String category(@PathVariable("id") long id, Model model) {
        model.addAttribute("category", categoryRepo.findById(id).get());
        model.addAttribute("cars", carRepo.findAll());
        return "category";
    }
    @RequestMapping("/contact")
    public String contactPage(){
        return "contact";
    }
    @RequestMapping("/about")
    public String aboutPage(){
        return "about";
    }

}
