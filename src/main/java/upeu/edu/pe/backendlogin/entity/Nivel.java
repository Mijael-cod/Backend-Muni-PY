package upeu.edu.pe.backendlogin.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class Nivel implements Serializable{
	
	
private static final long serialVersionUID = 1L;
	
	private int idnivel;
	private String nombrenivel;
	private String estadonivel;

}
