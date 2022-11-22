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
public class Os implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	private int idos;
	private String nombreos;
	private String estadoos;
	private String f_inicio;
	private String f_fin;
	private String codigoos;
	private String direccionos;


}
