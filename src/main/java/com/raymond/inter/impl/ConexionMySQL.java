package com.raymond.inter.impl;

import com.raymond.inter.IConexion;

public class ConexionMySQL implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;

    public ConexionMySQL(){
        this.host="localhost";
        this.puerto="3306";
        this.usuario="root";
        this.contraseña="123";
    }

    @Override
    public void conectar(){
        //Aquí puede ir código JDBC
        System.out.println("Se conectó a MySQL");
    }

    @Override
    public void desconectar(){
        //Aquí puede ir código JDBC
        System.out.println("Se desconectó de MySQL");
    }
}
