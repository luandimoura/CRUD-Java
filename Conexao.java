
package trabalho_final;
//Importacao das componentes "Java.sql"
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    //Declaracao das variaveis
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/alg3";

    public Conexao() {
        //Inicializa sem conexao
        conn = null;
        //Tenta executar o que esta dentro do "try". Caso nao consiga, o "catch" eh acionado
        try{
            //Verifica a presenca de eventuais erros no classpath
            //Garante que a classe do driver foi carregada, e pode ser reconhecida pelo DriverManager
            Class.forName(driver);
            /*Tenta a conexao passando os 3 parametros. "DriverManager" fica como responsavel
            por realizar a conexao*/
            conn = DriverManager.getConnection(url, user, password);
            //Verifica se a conexao foi estabelecida
            if(conn != null){
                System.out.println("Conexao realizada");
            }
        //Lanca a excecao caso a conexao nao seja estabelecida
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Erro na conexao " +e);
        }
    }
    
    //Metodo que retorna a conexao
    public Connection getConnection(){
        return conn;
    }
    
 }



    
    
            
    
   
