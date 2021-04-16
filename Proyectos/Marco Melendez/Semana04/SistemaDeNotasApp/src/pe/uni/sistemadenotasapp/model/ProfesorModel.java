package pe.uni.sistemadenotasapp.model;


public class ProfesorModel {

	private String idprofesor;
	private String nombres;
	private String apellidos;
	private String dni;
	private String direccion;
	private String telefono;
	private String email;
	private String clave;

	public ProfesorModel() {
	}

	public ProfesorModel(String idprofesor, String nombres, String apellidos, String dni, String direccion, String telefono, String email, String clave) {
		this.idprofesor = idprofesor;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.clave = clave;
	}

	public String getIdprofesor() {
		return idprofesor;
	}

	public void setIdprofesor(String idprofesor) {
		this.idprofesor = idprofesor;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	

}
