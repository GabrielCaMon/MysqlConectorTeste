package br.com;
import java.sql.*;


	public class Teste {
		
		private static final String driver = "com.mysql.cj.jdbc.Driver";
		private static final String user = "root";
		private static final String senha = "adminqwe123456";
		private static final String url = "jdbc:mysql://127.0.0.1:3306/cadastro?true&serverTimezone=GMT";
		private Connection con;
		
		public Teste() {
			try {
				this.con = this.conn();
			} catch (Exception e) {
				//log.severe("falha na conexão: "+e);
			}
		}
		
		private Connection conn() throws Exception {
			Class.forName(this.driver).newInstance();
	        Connection con = null;
	        try {
	        	con = (Connection) DriverManager.getConnection(this.url, this.user, this.senha);
	        	if(con != null) {
	        		return con;
	            }else {
	            	System.out.println("não conectou");
	            	
	            }
	        }
	        catch (Exception e) {
	        	//log.severe("erro na conexao: "+ e);
	        	con.close();
			}
	        return null;
		}
		
		public ResultSet query(String query) throws Exception {
			return this.con
					   .createStatement()
					   .executeQuery(query);
		}
		
		public void close() throws Exception {
			this.con.close();
		}

	}

