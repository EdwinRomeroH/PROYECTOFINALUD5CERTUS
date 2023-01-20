package com.example.demo.services;

import java.util.List;
import com.example.demo.entity.Proveedor;

public interface ProveedorService {
	public List<Proveedor> listarTodos();
	public void grabar(Proveedor proveedor);
	public Proveedor buscarPorId(long id);
	public void eliminar(Long id);
}