package miu.edu.lab3.Service;

import lombok.RequiredArgsConstructor;
import miu.edu.lab3.DTO.ProductDto;
import miu.edu.lab3.DTO.ReviewDto;
import miu.edu.lab3.Domain.Category;
import miu.edu.lab3.Domain.Product;
import miu.edu.lab3.Repository.AllRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class AllImpl implements AllService {
    @Autowired
    private  AllRepository allrepo;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<ProductDto> getByPriceIsGreaterThan(double minprice) {
        var data= allrepo.findAllByPriceIsGreaterThan(minprice);
        var result= new ArrayList<ProductDto>();
        for(Product p: data){
            var res= modelMapper.map(p, ProductDto.class);
            result.add(res);
        }
        return result;
      }
      @Override
    public List<ProductDto> getByCategoryAndPriceIsLessThan(Category cat, double maxprice) {
        var lists= allrepo.findByCategoryAndPriceIsLessThan(cat,maxprice);
        var last= new ArrayList<ProductDto>();
        for(Product p: lists){
            var res= modelMapper.map(p, ProductDto.class);
            last.add(res);
        }
        return last;
    }
    @Override
    public List<ProductDto> getByName(String name) {
        var data= allrepo.findAllByName(name);
        var myresult = new ArrayList<ProductDto>();
        for(Product product: data){
            var latest= modelMapper.map(product, ProductDto.class);
            myresult.add(latest);
        }
        return myresult;
        }

    @Override
    public List<ProductDto> getAll() {
        var data= allrepo.findAll();
        System.out.println(data);
        var latest= new ArrayList<ProductDto>();
        for(Product x: data){
            var result= modelMapper.map(x, ProductDto.class);
            latest.add(result);}
          return latest;
    }

    @Override
    public List<ReviewDto> findAllReviewsById(int productid) {
        var product =allrepo.findById(productid).orElseThrow(()->new RuntimeException("notfound"));
        var reviews =product.getReviews();
        var last= new ArrayList<ReviewDto>();
        reviews.forEach(m->{
            var result= modelMapper.map(m, ReviewDto.class);
          last.add(result);
        });
       return last;
    }
    @Override
    public void add(Product product) {
        allrepo.save(product);

    }
//name, price, rating
    @Override
    public Product update(int id, Product product) {
        Product p =  allrepo.findById(id).orElseThrow(()->new RuntimeException("notfound"));;
        p.setId(product.getId());
        p.setName(product.getName());
        p.setPrice(product.getPrice());
        p.setRating(product.getPrice());
        allrepo.save(p);
        return p;
    }

    @Override
    public void deleteById(int id) {
        allrepo.deleteById(id);
    }

    @Override
    public ProductDto findById(int productid) {
       var p= allrepo.findById(productid).orElseThrow(()->new RuntimeException("notfound"));
        var result= modelMapper.map(p, ProductDto.class);
        return result;
    }
}
