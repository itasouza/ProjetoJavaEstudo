/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.ConnectionFactory;
import modelo.Aluno;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author itamar.souza
 */
public class AlunoDAO {
     private Connection connection;
     long controle;	
     String ra;	 
     String nome;	
     String endereco;	
     String cidade;
     
      public AlunoDAO(){
       //usando o sql server 2008   
       this.connection = new ConnectionFactory().getConnectionSqlServer();
       //usando o Oracle XE 
      // this.connection = new ConnectionFactory().getConnectionOracle();
       //usando o Mysql
      // this.connection = new ConnectionFactory().getConnectionMysql();
    }
      
    public void adiciona(Aluno aluno){
        String sql = "INSERT INTO TB_ALUNOS(ra,nome,endereco,cidade) VALUES(?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, aluno.getRa());
           stmt.setString(2, aluno.getNome());
           stmt.setString(3, aluno.getEndereco());
           stmt.setString(4, aluno.getCidade());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
      
}
