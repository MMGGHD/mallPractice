package shop.mtcoding.mallpractice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

@Controller
public class ProductRepository {

//    @Autowired
//    private EntityManager em;

    @GetMapping("/")
    public String home(){
        return "home";
    }
}

