package com.valentino.homebanking.project.model;

import org.json.JSONObject;
import javax.persistence.*;

@Entity
@Table(name = "Client")
public class Client{


	/*Atributos privados de la clase*/

	@Id /* Sera el index de nuestra tabla */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String usuario;

	@Column(nullable = false)
	private String contraseña;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private String apellido;

	//


	public Client() {
	}

	public Client(Long id, String usuario, String contraseña, String email, String nombre, String apellido) {
		this.id = id;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.email = email;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/* Metodo para retornar nuestro objeto en un formato JSON */
	/*Este metodo es muy utilizado para poder transformar el objeto a JSON en caso de ser necesario para retorno*/
	public JSONObject toJSONObject() {
		JSONObject jo = new JSONObject();
		jo.put("id",getId());
		jo.put("usuario",getUsuario());
		jo.put("contraseña",getContraseña());
		jo.put("email",getEmail());
		jo.put("nombre",getNombre());
		jo.put("apellido",getApellido());
		return jo;
	}

}

