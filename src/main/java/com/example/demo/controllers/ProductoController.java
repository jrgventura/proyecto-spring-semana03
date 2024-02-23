package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Producto;
import com.example.demo.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/productos")
	public String getAllProduct(Model model) {
		
		List<Producto> lisProductos = productoService.getAllProducts();
		
		for (Producto producto : lisProductos ) {
			System.out.println(producto.id);
			System.out.println(producto.nombre);
			System.out.println(producto.empresa.idEmpresa);
			System.out.println(producto.empresa.nombre);
		}
		
		
		
		return "productList";
	}
	
}
