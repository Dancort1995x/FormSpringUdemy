package com.udemy.springboot.form.app.editors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.udemy.springboot.form.app.services.RoleService;

@Component
public class RolesEditor extends PropertyEditorSupport{

	@Autowired
	private RoleService serivce;
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			Integer id = Integer.parseInt(text);
			setValue(serivce.obtenerPorId(id));
		} catch (NumberFormatException e) {
			setValue(null);
		}
	}

}
