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
public class Documentos implements Serializable{
	
	
private static final long serialVersionUID = 1L;
	
	private int iddocumento;	
	private String doc_resolucion;
	private String certificado;
	private String informe_tecnico;
	private String credenciales;
	
}
