package maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    static void main(String[] args) {
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for (int mes = 0; mes < dias.length; mes++){
            for(int dia = 0; dia < dias.length; dia++){
                System.out.println(dias[mes][dia]);
            }
        }

        for(int[] arrBase:dias){
            for(int num:arrBase){
                System.out.println(num);
            }
        }

    }
}
