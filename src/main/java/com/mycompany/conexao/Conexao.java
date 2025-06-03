/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 1007899
 */
public class Conexao {

   public static Connection conectar() throws SQLException{
       String url = "jdbc:mysql://localhost:3308/conexao";
       String usuario = "root";
       String senha = "Gabriela#1302";
       return DriverManager.getConnection(url,usuario,senha);
       
   }  
}
