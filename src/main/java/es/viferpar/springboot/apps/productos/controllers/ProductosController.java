package es.viferpar.springboot.apps.productos.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.viferpar.springboot.apps.productos.models.entity.Producto;
import es.viferpar.springboot.apps.productos.service.ProductoService;

@RestController
public class ProductosController {

    // @Autowired
    // private Environment enviroment;

    @Value("${server.port}")
    private Integer port;

    @Autowired
    private ProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar() {
        return productoService.findAll().stream().map(p -> {
            // p.setPort(Integer.parseInt(enviroment.getProperty("server.port")));
            p.setPort(port);
            return p;
        }).collect(Collectors.toList());
    }

    @GetMapping("detalle/{id}")
    public Producto detalle(@PathVariable Long id) {
        Producto producto = productoService.findById(id);
        // producto.setPort(Integer.parseInt(enviroment.getProperty("server.port")));
        producto.setPort(port);
        return producto;
    }

}
