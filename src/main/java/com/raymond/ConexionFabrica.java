package com.raymond;

import com.raymond.inter.IConexion;
import com.raymond.inter.impl.ConexionMySQL;
import com.raymond.inter.impl.ConexionOracle;
import com.raymond.inter.impl.ConexionVacia;

public class ConexionFabrica {
    public IConexion getConexion(String motor){
        if(motor==null){
            return new ConexionVacia();
        }else if(motor.equalsIgnoreCase("MYSQL")){
            return new ConexionMySQL();
        }else if(motor.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();
        }
        return new ConexionVacia();
    }
}
