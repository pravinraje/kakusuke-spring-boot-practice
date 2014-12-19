package kksk.spring.boot.practice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User implements Serializable {

	private static final long serialVersionUID = 8589006495506400803L;

	@Id
	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String password;
}
