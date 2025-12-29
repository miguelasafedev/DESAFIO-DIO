import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso direcionado para Back-End em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso direcionado para Back-End em Python");
        curso2.setCargaHoraria(5);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso PHP");
        curso3.setDescricao("Curso direcionado para o Back-End em PHP");
        curso3.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria React");
        mentoria1.setDescricao("Mentoria direcionada para framework de Front-End");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria My SQL");
        mentoria2.setDescricao("Mentoria direcionada para banco de dados relacionais com MySql");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
