package br.com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		GafanhotosDAO gafanhotosDao = new GafanhotosDAO();
		//Connection conexaoMySQL = ConexaoBanco.getConexaoMySQL();
		
		//ResultSet executeQuery1 = conexaoMySQL.createStatement().executeQuery("select * from gafanhotos");
		
		
		//ArrayList<Gafanhotos> list = gafanhotosDao.list();	
		Gafanhotos insert = new Gafanhotos(null,"João Ricardo","Pedreiro",null,"M",23.5,1.8,"Brasileiro",2);
		gafanhotosDao.insert(insert);
		//Gafanhotos gafanhotos = list.get(0);
		//gafanhotos.setId(null);

		
		
	}

}
