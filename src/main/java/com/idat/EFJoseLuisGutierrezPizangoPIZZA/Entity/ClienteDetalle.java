package com.idat.EFJoseLuisGutierrezPizangoPIZZA.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente_pizza")
public class ClienteDetalle {

	@Id
	private PizzaClienteFK fk = new PizzaClienteFK();

	public PizzaClienteFK getFk() {
		return fk;
	}

	public void setFk(PizzaClienteFK fk) {
		this.fk = fk;
	}
	
}
