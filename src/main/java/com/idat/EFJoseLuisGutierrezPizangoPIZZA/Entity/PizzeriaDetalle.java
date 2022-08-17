package com.idat.EFJoseLuisGutierrezPizangoPIZZA.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pizzeria_pizza")
public class PizzeriaDetalle {

	@Id
	private PizzaPizzeriaFK fk = new PizzaPizzeriaFK();

	public PizzaPizzeriaFK getFk() {
		return fk;
	}

	public void setFk(PizzaPizzeriaFK fk) {
		this.fk = fk;
	}
	
}
