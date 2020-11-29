/**
 * 
 */
package com.students.domain;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.io.Serializable;

public class Phone implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull
	@Range(min = 100, max = 999, message = "{Phone.area.digit}")
 	private Integer area;

	@NotNull
	@Range(min = 100, max = 999, message = "{Phone.prefix.digit}")
 	private Integer prefix;

	@NotNull
	@Range(min = 1000, max = 9999, message = "{Phone.number.digit}")
 	private Integer number;
 
	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

 	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public void setPrefix(Integer prefix) {
		this.prefix = prefix;
	}
}
