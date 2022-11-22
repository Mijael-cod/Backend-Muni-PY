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
public class ZonaLocal implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	private int idzonalocal;
	private String nombrezonalocal;
	private String estadozonalocal;
	

}
