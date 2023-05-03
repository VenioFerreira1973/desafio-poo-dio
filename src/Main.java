import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcampo Java developer");
        bootcamp.setDescricao("Descricão Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev dev1 = new Dev();
        dev1.setNome("Venio");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Aluno: " + dev1.getNome());
        System.out.println("Conteudos inscritos: " + dev1.getConteudosIncritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos inscritos: " + dev1.getConteudosIncritos());
        System.out.println("Conteudos inscritos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        System.out.println("______________________________________________________________");
        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Aluno: " + dev2.getNome());
        System.out.println("Conteudos inscritos: " + dev2.getConteudosIncritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos inscritos: " + dev2.getConteudosIncritos());
        System.out.println("Conteudos inscritos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());




    }
}