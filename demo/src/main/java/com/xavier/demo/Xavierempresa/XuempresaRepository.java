package com.xavier.demo.Xavierempresa;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface XuempresaRepository extends CrudRepository<Xuempresa, Long>{
    @Modifying
    @Transactional
    @Query("DELETE FROM Xuempresa r WHERE r.name = ?1")
    void XudeleteByname(String name);

}
