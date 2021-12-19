package com.raymond.inter.impl;

import com.raymond.inter.IConexion;

public class ConexionOracle implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;

    public ConexionOracle(){
        this.host="localhost";
        this.puerto="1521";
        this.usuario="admin";
        this.contraseña="123";
    }

    @Override
    public void conectar(){
        //Aquí puede ir código JDBC
        System.out.println("Se conectó a Oracle");
    }

    @Override
    public void desconectar(){
        //Aquí puede ir código JDBC
        System.out.println("Se desconectó de Oracle");
    }
}
