package shop.mtcoding.mallpractice.model;

import lombok.Getter;

import javax.persistence.*;

// JPA라이브러리 필요
//@Getter
//@Table(name = "product")
//@Entity
public class Product {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;
    private Integer qty;
}
