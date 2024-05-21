package com.xavier.demo.Xaviersucursal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;
//Swagger
@RestController
@RequestMapping("/Xavisucursal")
public class XusucursalController {
    @Autowired
    private XusucursalService XusucursalService;

    @PostMapping("/")
    public Xusucursal Xusave(@RequestBody Xusucursal entity){
        return XusucursalService.Xusave(entity);
    }

    @GetMapping("/{id}")
    public Xusucursal  XufindById(@PathVariable long id){
        return XusucursalService.findById(id);
    }

    @PutMapping("/")
    public Xusucursal  Xuupdate(@RequestBody Xusucursal  entity){
        return XusucursalService.Xusave(entity);
    }
    
    @GetMapping("/all")
    public List<Xusucursal> XufindAll() {
        return XusucursalService.findAll();
    }

    @PostMapping("/insert")
    public Xusucursal Xuinsert(@RequestBody Xusucursal xusucursal) {
        return XusucursalService.insert(xusucursal);
    }
    @DeleteMapping("/delete/{name}/")
    public void XuDeleteByNombreRol(@PathVariable String name) {
        XusucursalService.XuDeleteByname(name);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        XusucursalService.deleteById(id);
    }
}
