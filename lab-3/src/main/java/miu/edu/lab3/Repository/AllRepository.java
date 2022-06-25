package miu.edu.lab3.Repository;


import miu.edu.lab3.Domain.Category;
import miu.edu.lab3.Domain.Product;

import miu.edu.lab3.Domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import java.util.List;
@Repository

public interface AllRepository extends JpaRepository<Product, Integer> {
   List <Product> findAllByPriceIsGreaterThan(double minprice);
   List<Product> findByCategoryAndPriceIsLessThan(Category cat, double maxprice);
   List<Product> findAllByName(String name);



}
