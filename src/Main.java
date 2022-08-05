import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;


public class Main {
    public static void main (String [] args){
        Curso curso1= new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2= new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp teste");
        bootcamp.setDescricao("Descriçao do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devUm = new Dev();
        devUm.setNome("Ciclano");
        devUm.inscreverBootcamp(bootcamp);
        System.out.println(devUm.getNome());
        System.out.println("Conteúdos inscritos: " + devUm.getConteudosInscritos());
        devUm.progredir();
        devUm.progredir();
        System.out.println("Progradindo...");
        System.out.println("Conteúdos inscritos: " + devUm.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devUm.getConteudosConcluidos());
        System.out.println("XP: " + devUm.calcularXp() );

        Dev devDois = new Dev();
        devDois.setNome("Ciclano");
        devDois.inscreverBootcamp(bootcamp);
        System.out.println(devDois.getNome());
        System.out.println("Conteúdos inscritos: " + devDois.getConteudosInscritos());
        devDois.progredir();
        System.out.println("Progradindo...");
        System.out.println("Conteúdos inscritos: " + devDois.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devDois.getConteudosConcluidos());
        System.out.println("XP: " + devDois.calcularXp() );


    }

}
