package com.xavier.demo.Xaviersucursal;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface XusucursalRepository extends CrudRepository<Xusucursal, Long>{
    @Modifying
    @Transactional
    @Query("DELETE FROM Xusucursal r WHERE r.name = ?1")
    void XudeleteByname(String name);
}
