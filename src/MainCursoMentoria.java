import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class MainCursoMentoria {
    public static void main(String[] args) {
        // instanciando a Classe curso e criando o objeto curso 1
        Curso curso1 = new Curso();
        // atribuindo valores aos atributos da classe curso1
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição do curso JAVA");
        curso1.setCargaHoraria(8);

        // instanciando a classe Curso e criando o objeto curso 2
        Curso curso2 = new Curso();
        // atribuindo valores aos atributos da classe curso2
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

        // instanciando a classe Mentoria e criando o objeto mentoria
        Mentoria mentoria = new Mentoria();
        // atribuindo valores aos atributos da classe mentoria
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Descrição mentoria JAVA");
        mentoria.setData(LocalDate.now());

        // exibindo os valores da classe curso 1
        System.out.println(curso1);
        // exibindo os valores da classe curso 2
        System.out.println(curso2);
        // exibindo os valores da classe mentoria
        System.out.println(mentoria);
    }
}
