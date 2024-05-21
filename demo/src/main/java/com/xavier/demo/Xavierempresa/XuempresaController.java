package com.xavier.demo.Xavierempresa;

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
@RestController
@RequestMapping("/Xavierempresa")
public class XuempresaController {
    @Autowired
    private XuempresaService XuempresaService;

    @PostMapping("/")
    public Xuempresa Xusave(@RequestBody Xuempresa entity){
        return XuempresaService.Xusave(entity);
    }
     //Metodo Obtener por id
    @GetMapping("/{id}")
    public Xuempresa  XufindById(@PathVariable long id){
        return XuempresaService.findById(id);
    }

    @PutMapping("/")
    public Xuempresa  Xuupdate(@RequestBody Xuempresa  entity){
        return XuempresaService.Xusave(entity);
    }
     //Metodo Obtener todos los datos
    @GetMapping("/all")
    public List<Xuempresa> XufindAll() {
        return XuempresaService.findAll();
    }

    @PostMapping("/insert")
    public Xuempresa Xuinsert(@RequestBody Xuempresa xuempresa) {
        return XuempresaService.insert(xuempresa);
    }
    //Metodo Eliminar por nombre
    @DeleteMapping("/delete/{name}/")
    public void XuDeleteByNombreRol(@PathVariable String name) {
        XuempresaService.XuDeleteByname(name);
    }
    //Metodo Eliminar por id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        XuempresaService.deleteById(id);
    }
}