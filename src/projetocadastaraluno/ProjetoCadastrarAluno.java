/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetocadastaraluno;
import Telas.TelaInicial;
import java.util.ArrayList;
import DadoAluno.Alunos;
/**
 *
 * @author robso
 */
public class ProjetoCadastrarAluno {
    /**
     * @param args the command line arguments
     */
    public static ArrayList<Alunos> listaAlunos = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        TelaInicial tela1 = new TelaInicial();
        tela1.setVisible(true);
    }
    
    //Lista de Alunos cadastraddos 
    public static void listaAlunos(Alunos alunos){
        listaAlunos.add(alunos);
        System.out.println("ALUNO CADASTRADO: \n" + alunos + "\n");
    }
    
}
