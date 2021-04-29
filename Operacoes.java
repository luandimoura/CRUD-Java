package trabalho_final;

//Importacao dos componentes necessarios da biblioteca "Java.sql"
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//Importacao do componente JOptionPane do Java Swing
import javax.swing.JOptionPane;

public class Operacoes {
    
    //Cadastrar time de futebol
    //Eh passado como parametro uma variavel do tipo 'Time' chamada 'time01'
    public void cadastrar(Time time01){
        //Realiza a conexao com o banco de dados
        Conexao conn = new Conexao();
        Connection cntn = conn.getConnection();
        //Comando SQL para insercao de dados na tabela
        String sql = "insert into times_de_futebol(id_time, nome, apelido, mascote, "
                + "ano_de_fundacao,localizacao) values(?,?,?,?,?,?)";
        //Tenta realizar os seguintes comandos. Caso nao consiga, o catch eh acionado
         try {
            //Realiza a captura dos valores para inserir, posteriormente, no banco de dados
            /*PreparedStatement faz uma pre-otimizacao. Se pretendemos utiizar um comando sql 
            repetidas vezes, mudando apenas os parametros, o uso do PreparedStatement sera mais
            rapido e com menos carga sobre o banco de dados*/
            PreparedStatement ps = cntn.prepareStatement(sql);
            ps.setInt(1, time01.id_time);
            ps.setString(2, time01.nome);
            ps.setString(3, time01.apelido);
            ps.setString(4, time01.mascote);
            ps.setInt(5, time01.ano_de_fundacao);
            ps.setString(6, time01.localizacao);
            //Executa a operacao
            ps.executeUpdate();
            //Exibe uma mensagem na tela para informar que o cadastro foi realizado
            JOptionPane.showMessageDialog(null, "cadastrado com sucesso");
            //Encerra o Preparedstatement
            ps.close();
            //Encerra a conexao com o banco de dados
            cntn.close();
        //Captura a excecao
        }catch (SQLException ex){
            //Exibe uma mensagem na tela para informar que ocorreu um erro ao cadastrar
            JOptionPane.showMessageDialog(null, "problemas ao cadastrar " + ex);
        }
    }
    
    //Alterar time de futebol
    //Eh passado como parametro uma variavel do tipo 'Time' chamada 'time01'
    public void alterar(Time time01){
       //Realiza a conexao com o banco de dados
       Conexao conn = new Conexao();
       Connection cntn = conn.getConnection();
       
       //Comando SQL para alteracao de dados de um time de futebol
       String sql = "update times_de_futebol set nome=?, apelido=?, mascote=?, ano_de_fundacao=?,"
               + " localizacao=? where id_time=?";
       //Realiza a captura dos valores para inserir, posteriormente, no banco de dados
       try {
            PreparedStatement ps = cntn.prepareStatement(sql);
            ps.setString(1, time01.nome);
            ps.setString(2, time01.apelido);
            ps.setString(3, time01.mascote);
            ps.setInt(4, time01.ano_de_fundacao);
            ps.setString(5, time01.localizacao);
            ps.setInt(6, time01.id_time);
            //Executa a operacao
            ps.executeUpdate();
            //Exibe uma mensagem na tela para informar que a alteracao foi realizada
            JOptionPane.showMessageDialog(null, "alterado com sucesso");
            //Encerra o Preparedstatement
            ps.close();
            //Encerra a conexao com o banco de dados
            cntn.close();
        //Captura a excecao    
        } catch (SQLException ex) {
            //Exibe uma mensagem na tela para informar que ocorreu um erro ao alterar
            JOptionPane.showMessageDialog(null, "problemas ao alterar " + ex);
        }

    }
    //Variaveis para verificar se a consulta eh valida
    int x,y;
    //Consultar os dados de um time especifico baseado no codigo
    //O metodo consultar eh do tipo "Time". O codigo do time eh passado como parametro
    public Time consultar (int codigo){
       //Realiza a conexao com o banco de dados
       Conexao conn = new Conexao();
       Connection cntn = conn.getConnection();
       //Instancia de um objeto "time01"
       Time time01 = new Time();
       //Comando SQL para consulta de dados na tabela baseada no id do time
       String sql = "select* from times_de_futebol where id_time=?";
       //Declaracao da variavel "ps" de PreparedStatement
       PreparedStatement ps;
       
       try{
           //Atribuicao a variavel "ps"
           ps = cntn.prepareStatement(sql);
           ps.setInt(1, codigo);
           //O ResultSet eh utilizado para guardar dados vindos de um banco de dados
           //Ele guarda o resultado de uma pesquisa numa estrutura de dados que pode ser percorrida
           ResultSet rs = ps.executeQuery();
           //Percorre o ResultSet
           while(rs.next()){
               //Guarda os valores em cada variavel especifica
               int id_time = rs.getInt("id_time");
               String nome = rs.getString("nome");
               String apelido = rs.getString("apelido");
               String mascote = rs.getString("mascote");
               int ano = rs.getInt("ano_de_fundacao");
               String localizacao = rs.getString("localizacao");
               /*Adiciona os valores obtidos da consulta como caracteristicas do objeto instanciado
               "time01"*/
               //"time01" eh setado 
               time01.setId_time(id_time);
               time01.setNome(nome);
               time01.setApelido(apelido);
               time01.setMascote(mascote);
               time01.setAno_de_fundacao(ano);
               time01.setLocalizacao(localizacao);
               
               //Salva o codigo do time e ano de fundacao
               x = id_time;
               y = ano;
           }
           /*Devido a um erro de consulta, inseri essa verificacao. Se for retornado id_time = 0 e
           ano_de_fundacao = 0, nao existe consulta para o codigo do time informado
           */ 
           if(x != 0 && y != 0)
                JOptionPane.showMessageDialog(null, "consultado com sucesso");
           else
               JOptionPane.showMessageDialog(null, "Consulta inválida");
           
           //PreparedStatement encerrado
           ps.close();
           //Conexao com o o banco encerrada
           cntn.close();
       //Captura da excecao
       }catch(SQLException ex){
           //Exibe uma mensagem na tela para informar que ocorreu um erro ao consultar
           JOptionPane.showMessageDialog(null, "problemas na consulta " + ex); 
       }
       //retorna o objeto "time01"
       return time01;
    }
    //Excluir um time especifico baseado no seu codigo
    // O codigo do time eh passado como parametro
    public void excluir(int codigo){
       //Realiza a conexao com o banco de dados
       Conexao conn = new Conexao();
       Connection cntn = conn.getConnection();
       
       //Comando SQL para exclusão de um time na tabela baseado no id do time
       String sql = "delete from times_de_futebol where id_time=?";
       
       try {
            //Uso do PreparedStatement para realizar a exclusao
            PreparedStatement ps = cntn.prepareStatement(sql);
            ps.setInt(1, codigo);
            //Executa a operacao
            ps.executeUpdate();
            ////Exibe uma mensagem na tela para informar que a exclusao foi realizada
            JOptionPane.showMessageDialog(null, "excluído com sucesso");
            //PreparedStatement encerrado
            ps.close();
            //Conexao com o o banco encerrada
            cntn.close();
        //Captura da excecao
        } catch (SQLException ex) {
            //Exibe uma mensagem na tela para informar que ocorreu um erro ao alterar
            JOptionPane.showMessageDialog(null, "problemas para excluir " + ex);
        }
    }
    
}
    
    
   
