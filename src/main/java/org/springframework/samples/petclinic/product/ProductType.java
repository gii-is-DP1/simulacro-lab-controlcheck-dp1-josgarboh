package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "productypes")
public class ProductType extends BaseEntity{
    
    @NotNull
	@Column(name = "name", unique = true)
	@Size(min = 3, max = 150)
	String name;
   
}
