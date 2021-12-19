package com.raymond.inter.impl;

import com.raymond.inter.IConexion;

public class ConexionVacia implements IConexion {

    @Override
    public void conectar(){
        //Aquí puede ir código JDBC
        System.out.println("No se especificó proveedor");
    }

    @Override
    public void desconectar(){
        //Aquí puede ir código JDBC
        System.out.println("No se especificó proveedor");
    }
}
