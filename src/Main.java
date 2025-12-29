import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso LPA - Java");
        curso1.setDescricao("Curso direcionado logica de programacao em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso POO - Java");
        curso2.setDescricao("Curso direcionado para programacao orientada a objetos em Java");
        curso2.setCargaHoraria(5);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso PHP");
        curso3.setDescricao("Curso direcionado para o Back-End em PHP");
        curso3.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Spring Boot");
        mentoria1.setDescricao("Mentoria direcionada para framework de Back-End em Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria My SQL");
        mentoria2.setDescricao("Mentoria direcionada para banco de dados relacionais com MySql");
        mentoria2.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria1);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp focado em desenvolvimento Back-End com java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devClaudio = new Dev();
        devClaudio.setNome("Claudio");
        devClaudio.inscreverBootcamp(bootcamp);
        System.out.println("Claudio - Conteudos Inscritos: " + devClaudio.getConteudosInscritos());
        devClaudio.progredir();
        devClaudio.progredir();
        System.out.println("Claudio - Conteudos Inscritos: " + devClaudio.getConteudosInscritos());
        System.out.println("Claudio - Conteudos Concluidos: " + devClaudio.getConteudosConcluidos());
        System.out.println("XP: " + devClaudio.calcularTotalXp());

        System.out.println("------------------------");

        Dev devBianca = new Dev();
        devBianca.setNome("Bianca ");
        devBianca.inscreverBootcamp(bootcamp);
        System.out.println("Bianca - Conteudos Inscritos: " + devBianca.getConteudosInscritos());
        devBianca.progredir();
        System.out.println("Bianca - Conteudos Inscritos: " + devBianca.getConteudosInscritos());
        System.out.println("Bianca - Conteudos Concluidos: " + devBianca.getConteudosConcluidos());
        System.out.println(devBianca.calcularTotalXp());

    }

}
