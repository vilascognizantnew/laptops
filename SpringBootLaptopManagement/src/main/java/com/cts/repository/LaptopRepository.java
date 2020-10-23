package com.cts.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Employee, Long>{

}
