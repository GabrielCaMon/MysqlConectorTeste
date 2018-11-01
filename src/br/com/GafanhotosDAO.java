package br.com;

import java.sql.ResultSet;
import java.util.ArrayList;

public class GafanhotosDAO {
	public ArrayList<Gafanhotos> list() throws Exception {	
	ArrayList<Gafanhotos> list = new ArrayList<Gafanhotos>();
		Teste conexaoMysql2 = new Teste();
		ResultSet executeQuery = conexaoMysql2.query("select * from gafanhotos");		
		while(executeQuery.next()) {
			Gafanhotos gafanhotos = new Gafanhotos(executeQuery.getInt("id"),
													executeQuery.getString("nome"),
													executeQuery.getString("profissao"),
													executeQuery.getDate("nascimento"), 
													executeQuery.getString("sexo"),
													executeQuery.getDouble("peso"),
													executeQuery.getDouble("altura"),
													executeQuery.getString("nacionalidade"),
													executeQuery.getInt("cursopreferido"));
			list.add(gafanhotos);
		}
		conexaoMysql2.close();
		return list;
	}
	
	public void insert(Gafanhotos gafanhotos) throws Exception {
		String query = "insert into gafanhotos values(0,'"+gafanhotos.getNome()+"','"+gafanhotos.getProfissao()+"','null','"+gafanhotos.getSexo()+"',"+gafanhotos.getPeso()+","+gafanhotos.getAltura()+",'"+gafanhotos.getNacionalidade()+"',"+gafanhotos.getCursopreferido();
		Teste conexaoMysql2 = new Teste();
		ResultSet executeQuery = conexaoMysql2.query(query);
		
	}
	
}
