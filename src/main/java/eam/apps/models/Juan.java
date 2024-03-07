package eam.apps.models;

import jakarta.persistence.*;

@Entity
@Table (name = "juan")
public class Juan {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "propietario")
    private String propietario;

    @Column(name = "carro")
    private String carro;
    
    @Column(name = "color")
    private String color;
    
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "telefono")
    private String telefono;
    
  

	public Juan() {
		super();
	}

	public Juan(Long id,String propietario, String carro, String color, String correo, String telefono) {
		super();
		this.id = id;
		this.propietario = propietario;
		this.carro = carro;
		this.color = color;
		this.correo = correo;
		this.telefono = telefono;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	} 
	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	

	
    
    
}