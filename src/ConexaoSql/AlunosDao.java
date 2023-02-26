/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexaoSql;
//Bibliotecas necessárias para conexão do netBeans com o MySql
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import DadoAluno.Alunos;
/**
 *
 * @author robso
 */
public class AlunosDao {
    Connection connectBD;
    Statement st;
    
    //Metodo de conexão com banco de dados
    public boolean connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connectBD = DriverManager.getConnection("jdbc:mysql://localhost:3306/novosAlunos", "root", "");
            st = connectBD.createStatement();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        } 
      
    }
    
    /**
     * O metodo salvar vai receber como parametro um objeto da calsse que eu quero salvar no banco de dados.
     * Nesse caso, o objeto é minha classe Aluno.
     * @param aluno
     * @return 
     */
   public boolean salvarBD(Alunos alunos){
        try {
            String sql;
            sql= "INSERT INTO dados VALUES('" + alunos.getNome() + "', " + alunos.getIdade() + ", '" + alunos.getSexo() + "','" + alunos.getResponsavel() +"')";
            st.executeUpdate(sql);
            return true;
        } catch (SQLException ex) {
            return false;
        }
   }
   
   //Metodo de desconexão com o mySql
   public void desconectar(){
        try {
            connectBD.close();
        } catch (SQLException ex) {
          
        }
   }
    
}
