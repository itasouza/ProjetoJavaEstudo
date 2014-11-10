/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author itamar.souza
 */
public class TestaConexaoOracle {
        	 public static void main(String[] args) throws SQLException {
                 try (Connection connection = new ConnectionFactory().getConnectionOracle()) {
                     System.out.println("Conexão aberta no Oracle!");
                 }
	    }
}
