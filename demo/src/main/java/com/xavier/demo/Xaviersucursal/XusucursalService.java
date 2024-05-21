package com.xavier.demo.Xaviersucursal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.List;

@Service
public class XusucursalService {
    @Autowired
    private XusucursalRepository XusucursalRepository;

    public Xusucursal Xusave(Xusucursal entity){
        return XusucursalRepository.save(entity);
    }

    public Xusucursal findById(long id){
        return XusucursalRepository.findById(id).orElse(null);
    }

    public void deleteById(long id){
        XusucursalRepository.deleteById(id);
    }

    public Xusucursal insert(Xusucursal xusucursal) {
        return XusucursalRepository.save(xusucursal);
    }

    public List<Xusucursal> findAll() {
        List<Xusucursal> result = new ArrayList<>();
        XusucursalRepository.findAll().forEach(result::add);
        return result;
    }
    public void XuDeleteByname(String name) {
        XusucursalRepository.XudeleteByname(name);
    }
}
