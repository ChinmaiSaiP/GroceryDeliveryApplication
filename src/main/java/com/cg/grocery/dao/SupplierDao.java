package com.cg.grocery.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.grocery.entity.Distributor;
import com.cg.grocery.entity.Supplier;



@Repository
public interface SupplierDao extends JpaRepository<Supplier, Integer>{

}
