package shop.mtcoding.mallpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import shop.mtcoding.mallpractice.model.ProductRepository;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
}
