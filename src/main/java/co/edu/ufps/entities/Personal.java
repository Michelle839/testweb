package co.edu.ufps.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Data
@Entity
public class Personal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // El 'id' será generado automáticamente
	private Integer id;
	private String documento;
	private String nombre;
	private String email;
	private String telefono;

}