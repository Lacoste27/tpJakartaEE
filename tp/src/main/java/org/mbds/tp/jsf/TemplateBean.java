/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package org.mbds.tp.jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robsona
 */
@Named(value = "templateBean")
@RequestScoped
public class TemplateBean {

    /**
     * Creates a new instance of TemplateBean
     */
    public TemplateBean() {
    }

    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String afficher() {
        return "affichage__4?nb=" + nombre + "&faces-redirect=true";
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }
}
