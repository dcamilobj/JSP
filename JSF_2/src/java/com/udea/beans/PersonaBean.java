/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.beans;

import com.udea.classes.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camilo
 */
public class PersonaBean {

    private Persona p= new Persona();
    private static List<Persona> listaPersonas= new ArrayList();
    
    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }

    /**
     * @return the p
     */
    public Persona getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(Persona p) {
        this.p = p;
    }

    /**
     * @return the listaPersonas
     */
    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    /**
     * @param listaPersonas the listaPersonas to set
     */
    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
    public void agregarPersona()
    {
        listaPersonas.add(p);
    }
    
    public void eliminarPersona(Persona per)
    {
        listaPersonas.remove(per);
    }
}
