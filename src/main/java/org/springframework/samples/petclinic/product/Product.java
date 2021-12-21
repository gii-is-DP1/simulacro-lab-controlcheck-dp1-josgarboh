package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "products")
public class Product extends BaseEntity{
	
	@NotNull
	@Column(name = "name")
	@Size(min = 3, max = 150)
	String name;
	
	@NotNull
	@Column(name = "price")
	@Range(min = 0)
	Double price;
	
	@ManyToOne
	@JoinColumn(name = "producttype")
	ProductType productType;
}
