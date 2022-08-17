package com.idat.EFJoseLuisGutierrezPizangoPIZZA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EFJoseLuisGutierrezPizangoPIZZA.DTO.Cliente;
import com.idat.EFJoseLuisGutierrezPizangoPIZZA.Entity.ClienteDetalle;

public interface ClienteDetalleRepository extends JpaRepository<ClienteDetalle, Integer>{

	void save(Cliente cliente);

}
