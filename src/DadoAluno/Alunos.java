/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DadoAluno;

/**
 *
 * @author robso
 */
public class Alunos {
    //Atributos da classe Aluno
    private int numero, idade;
    private String nome, sexo, responsavel;
   
    //Cariavel Static para contar o numero de alunos cadastrados 
    public static int numeroCadastro = 1;
    
    //Metodo fazer aniversario
    public void aniversario(){
        this.idade++;
    }
    
    //Contrutor
    public Alunos(String nome, int idade, String sexo, String responsavel) {
        this.numero = numeroCadastro;
        //Vai tualizar o contador a cada aluno cadastrado.
        numeroCadastro++;
        
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.responsavel = responsavel;
    }
    
    //Apresentar aluno cadastrados na tela
    
     @Override
    public String toString() {
        return "Numero: " +this.numero + "\nNome: " + this.nome + 
                "\nIdade: " + this.idade + "\nSexo: " + this.sexo + 
                "\nResponsavel: " + this.responsavel;
        
    }
    
    //Metodos especiais
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static int getNumeroCadastro() {
        return numeroCadastro;
    }

    public static void setNumeroCadastro(int numeroCadastro) {
        Alunos.numeroCadastro = numeroCadastro;
    }
     
    
     
    
}
