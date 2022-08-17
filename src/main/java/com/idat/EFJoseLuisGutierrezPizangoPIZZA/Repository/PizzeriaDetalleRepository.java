package com.idat.EFJoseLuisGutierrezPizangoPIZZA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EFJoseLuisGutierrezPizangoPIZZA.DTO.Pizzeria;
import com.idat.EFJoseLuisGutierrezPizangoPIZZA.Entity.PizzeriaDetalle;

public interface PizzeriaDetalleRepository extends JpaRepository<PizzeriaDetalle, Integer>{

	void save(Pizzeria pizzeria);

}
