package com.company_mngm_sys.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company_mngm_sys.demo.entity.Products;

@Repository
public interface ProductsRepository extends CrudRepository <Products, Integer>{
    
    
    @Override
    public List<Products> findAll();   

}
