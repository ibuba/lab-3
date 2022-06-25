package miu.edu.lab3.Controller;


import miu.edu.lab3.DTO.ProductDto;
import miu.edu.lab3.DTO.ReviewDto;
import miu.edu.lab3.Domain.Category;
import miu.edu.lab3.Domain.Product;
import miu.edu.lab3.Service.AllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class AllController {
    @Autowired
    private AllService allservice;

    @GetMapping("/products")
    List<ProductDto> getAll() {
        System.out.println("called");
        return allservice.getAll();
    }

    @GetMapping
    List<ProductDto> getByPriceIsGreaterThan(@RequestParam double minprice) {
        return allservice.getByPriceIsGreaterThan(minprice);
    }

    @GetMapping("/filter")
    List<ProductDto> getByCategoryAndPriceIsLessThan(Category cat, @RequestParam double maxprice) {
        return allservice.getByCategoryAndPriceIsLessThan(cat, maxprice);
    }

    @GetMapping("/{name}")
    List<ProductDto> getByName(@PathVariable String name) {
        return allservice.getByName(name);
    }


    @GetMapping("/review/{pId}")
    List<ReviewDto> findById(@PathVariable int pid) {
        return allservice.findAllReviewsById(pid);
    }

    @PostMapping("/add")
    public void add(Product product) {
        allservice.add(product);
    }

}

