/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
//faz as importações de classes necessárias para o funcionamento do programa
import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções

/**
 *
 * @author itamar.souza RA 1713100150
 */
public class ConnectionFactory {
   
    
	//conexão ao mysql
  public Connection getConnectionMysql() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/projetojava","ita","root");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
      }
   }

       //conexão ao sql server
	public Connection getConnectionSqlServer() {
        try {
            return DriverManager.getConnection("jdbc:sqlserver://probarsrvdsv01\\ESTOQUE:1433;databaseName=ICATU_BKP","os","osame");            
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
        
  
       //conexão Oracle
	public Connection getConnectionOracle() {
        try {
            return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","os","osame");            
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
        
}
