package com.company_mngm_sys.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.company_mngm_sys.demo.entity.Clients;

public interface ClientRepository extends CrudRepository<Clients, Long> {
    @Override
    public List<Clients> findAll();
}
