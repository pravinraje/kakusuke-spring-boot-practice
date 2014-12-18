package kksk.spring.boot.practice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.util.Base64Utils;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 8589006495506400803L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String password;

	protected User() {
	}

	public User(String name) {
		password = new String(Base64Utils.encode(name.getBytes()));
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (password == null)
			password = new String(Base64Utils.encode(name.getBytes()));
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return getName() + "\t" + getPassword();
	}
}
