package com.company_mngm_sys.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.company_mngm_sys.demo.entity.Login;

public interface LoginRepo extends CrudRepository<Login,String> {
    
}
