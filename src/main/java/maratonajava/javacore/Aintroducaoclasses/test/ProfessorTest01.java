package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre-Kame";
        professor.idade = 140;
        professor.sexo = 'M';
        System.out.println(professor.nome + ' ' + professor.idade + ' ' + professor.sexo);
    }
}
