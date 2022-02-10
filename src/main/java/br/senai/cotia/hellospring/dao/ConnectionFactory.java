package br.senai.cotia.hellospring.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class ConnectionFactory {
	private static final String USUARIO = "root";
	private static final String SENHA = "";

	public static Connection conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/minhadatabase",USUARIO,SENHA);
			return conexao;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
