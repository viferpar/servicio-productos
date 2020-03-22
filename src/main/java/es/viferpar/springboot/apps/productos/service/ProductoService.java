package es.viferpar.springboot.apps.productos.service;

import java.util.List;

import es.viferpar.springboot.apps.productos.models.entity.Producto;

public interface ProductoService {

    public List<Producto> findAll();

    public Producto findById(Long id);

}
