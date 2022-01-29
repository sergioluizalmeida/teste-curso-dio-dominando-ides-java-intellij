package br.com.dio;

import br.com.dio.model.Gato;


public class primeiroprograma {
    public static void main(String[] args) {

        Gato gato = new Gato();         /* Quando a classe gato fica em evidÊncia ´´eo pq nao colocamos o import */
        System.out.println(gato);

        String nome;
        Livro Livro1 = new Livro( nome: "O Problema dos 3 Copos", numpaginas 300 );
        System.out.println(Livro1);
        

       /* int a = 5;
        int b = 3;
        System.out.println("Hello World - 5 + 3 = " + (a+b));*/
    }

}

class Livro {
    private String nome;
    private String numpaginas;

    public Livro(String nome, String numpaginas) {
        this.nome = nome;
        this.numpaginas = numpaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(String numpaginas) {
        this.numpaginas = numpaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome=" + nome +
                ", numpaginas='" + numpaginas + '\'' +
                '}';
    }

}