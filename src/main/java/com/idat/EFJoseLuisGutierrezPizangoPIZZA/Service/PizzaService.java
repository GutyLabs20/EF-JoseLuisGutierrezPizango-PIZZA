package com.idat.EFJoseLuisGutierrezPizangoPIZZA.Service;

import com.idat.EFJoseLuisGutierrezPizangoPIZZA.DTO.Cliente;
import com.idat.EFJoseLuisGutierrezPizangoPIZZA.DTO.Pizzeria;

public interface PizzaService {
	void guardarCliente(Cliente cliente);
	void guardarPizzeria(Pizzeria pizzeria);
	void asignarPizzeriaPizza();
	void asignarClientePizza();
}
