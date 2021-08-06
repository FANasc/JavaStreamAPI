package one.innovation.digital;

import java.util.*;
import java.util.Arrays;
import java.util.List;

/**********************************************************************************************************
 *
 * Objetivo: Utilizando uma lista com um objeto complexo (Estudantes, por exemplo)
 *           realize as seguintes operações:
 *           A) Transformar cada estudante em uma string com os atributos do objeto.
 *           B) Contar a quantidade de estudantes que tem na coleção.
 *           C) Filtrar estudantes com idade igual ou superior a 18 anos.
 *           D) Exibir cada elemento no console.
 *           E) Retornar estudantes com nome que possui a letra B no nome.
 *           F) Retornar se existe ao menos um estudante com a letra D no nome.
 *           G) Retornar o estudante mais velho (maior idade) da coleção. Retornar o mais novo também.
 **********************************************************************************************************/

public class Main {

    public static void main(String[] args) {

        // (A) Transformar cada estudante em uma string com os atributos do objeto.
        List<Estudante> listaEstudantes = Arrays.asList(
                new Estudante("Pedro",   18),
                new Estudante("Thayse",  15),
                new Estudante("Marcelo", 20),
                new Estudante("Carla",   25),
                new Estudante("Juliana", 21),
                new Estudante("Tiago",   19),
                new Estudante("Bernardo",23));

        // (B) Contar a quantidade de estudantes que tem na coleção.
        System.out.println("Quantidade de estudantes: " +
                listaEstudantes.stream().count());

        // (C) Filtrar estudantes com idade igual ou superior a 18 anos.
        System.out.println("Estudante a partir de 18 anos:");
        listaEstudantes.stream()
                .filter(p -> p.getIdade() >= 18)
                .forEach(p -> {
                    System.out.print(p.getNome().concat(" - "));
                    System.out.println(p.getIdade());
                });

        // (D) Exibir cada elemento no console.
        System.out.println("Exibir cada estudante da lista:");
        listaEstudantes.stream()
                .filter(p -> !p.getNome().isEmpty())
                .forEach(p -> {
                    System.out.print(p.getNome().concat(" - "));
                    System.out.println(p.getIdade());
                });

        // (E) Retornar estudantes com nome que possui a letra B no nome.
        System.out.print("Nome com letra B: ");
        listaEstudantes.stream()
                .filter(p -> p.getNome().contains("B"))
                .map(p -> p.getNome())
                .forEach(System.out::println);

        // (F) Retornar se existe ao menos um estudante com a letra D no nome.

        boolean temComLetraD = listaEstudantes.stream().anyMatch(D -> D.getNome().contains("D"));

        System.out.println("Estudante com letra D = " + temComLetraD);

        // (G) Retornar o estudante mais velho (maior idade) da coleção. Retornar o mais novo também.

        Comparator<Estudante> comparator = Comparator.comparing( Estudante::getIdade );

        Estudante minObject = listaEstudantes.stream().min(comparator).get();
        Estudante maxObject = listaEstudantes.stream().max(comparator).get();

        System.out.println("Estudante com menor idade = " + minObject);
        System.out.println("Estudante com maior idade = " + maxObject);
    }
}