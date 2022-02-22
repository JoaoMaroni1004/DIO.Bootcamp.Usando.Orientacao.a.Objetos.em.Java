import br.com.dio.desafio.dominio.*;

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

        /* exibindo os valores da classe curso 1
        System.out.println(curso1);
        // exibindo os valores da classe curso 2
        System.out.println(curso2);
        // exibindo os valores da classe mentoria
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos para Camila: " + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Conteúdos restantes para Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluídos para Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Camila possui: " + devCamila.calcularTotalXp() + " XP");

        System.out.println("------------------------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos para João: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Conteúdos restantes para João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos para João: " + devJoao.getConteudosConcluidos());
        System.out.println("João possui: " + devJoao.calcularTotalXp() + " XP");
    }
}
