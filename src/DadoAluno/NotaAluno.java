/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DadoAluno;

/**
 *
 * @author robso
 */
public class NotaAluno {
    //Atributos
    private double nota1, nota2, nota3, media;
    
    //Metodo contrutor
    public NotaAluno(double nota1, double nota2, double nota3, double media) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Nota: " + this.nota1 + "\nNota: " + this.nota2 + 
                "\nNota: " + this.nota3 + "\nMédia: " + this.media;
    }
    

    
    //Metodos especiais
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    
}
