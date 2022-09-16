/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ticiano
 */
public class Banco {
    
    
     
    private static final List<Empresa> lista = new ArrayList<>();
    
    public void adiciona(Empresa empresa){
        Banco.lista.add(empresa);
    }
    
    public List<Empresa> getEmpresas(){
        return Banco.lista;
}
    
    static{
    Empresa empresa1 = new Empresa();
    Empresa empresa2 = new Empresa();
    
    empresa1.setId(1);
    empresa1.setNome("alura");
    empresa2.setId(2);
    empresa2.setNome("caelum");
    lista.add(empresa1);
    lista.add(empresa2);
    
    }
    
}
