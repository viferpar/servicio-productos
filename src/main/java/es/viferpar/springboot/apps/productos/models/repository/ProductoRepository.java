package es.viferpar.springboot.apps.productos.models.repository;

import org.springframework.data.repository.CrudRepository;

import es.viferpar.springboot.apps.productos.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
