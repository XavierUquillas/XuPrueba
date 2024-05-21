package com.xavier.demo.Xavierempresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class XuempresaService {
    
    @Autowired
    private XuempresaRepository XuempresaRepository;

    public Xuempresa Xusave(Xuempresa entity){
        return XuempresaRepository.save(entity);
    }

    public Xuempresa findById(long id){
        return XuempresaRepository.findById(id).orElse(null);
    }

    public void deleteById(long id){
        XuempresaRepository.deleteById(id);
    }

    public Xuempresa insert(Xuempresa xuempresa) {
        return XuempresaRepository.save(xuempresa);
    }

    public List<Xuempresa> findAll() {
        List<Xuempresa> result = new ArrayList<>();
        XuempresaRepository.findAll().forEach(result::add);
        return result;
    }

    public void XuDeleteByname(String name) {
        XuempresaRepository.XudeleteByname(name);
    }

}