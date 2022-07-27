import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);curso1.setTitulo("curso java");

        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);curso1.setTitulo("curso java");

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Julia:" + devJulia.getConteudosInscritos());
        devJulia.progredir();
        devJulia.progredir();

        System.out.println("--------");
        System.out.println("Conteudos Inscritos Julia:" + devJulia.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Julia:" + devJulia.getConteudosConcluidos());
        System.out.println("XP:" + devJulia.calcularTotalXp());

        System.out.println("--------");

        Dev devFrancisco = new Dev();
        devFrancisco.setNome("Francisco");
        devFrancisco.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Francisco:" + devFrancisco.getConteudosInscritos());

        devFrancisco.progredir();
        devFrancisco.progredir();
        devFrancisco.progredir();

        System.out.println("--------");
        System.out.println("Conteudos Inscritos Francisco:" + devFrancisco.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Francisco:" + devFrancisco.getConteudosConcluidos());
        System.out.println("XP:" + devFrancisco.calcularTotalXp());



    }
}
