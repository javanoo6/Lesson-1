import java.util.Scanner;

import static java.lang.System.out;

public class ConditionalStatement {


    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        char М ='М';
        char I ='I';
            float b =1.80f;
        out.println("Введите возраст: ");
        int age = Input.nextInt();

        out.println("Введите пол М или Ж: TRUE=M FALSE=Ж ");
        boolean sexgender = Input.nextBoolean();

        out.println("Введите рост: ");
        float height = Input.nextFloat();
        //Input.close();
        out.println("Введите первую букву имени: ");
        char перваябукваимени = Input.next().charAt(0);


        if (age > 20) {
            out.println("Введенный возраст больше 20 ");
        }

        if (sexgender) {
            out.println("Пол - М ");
        }

        if (!sexgender) {
            out.println("Пол - Ж ");
        }

        if (height < b){
            out.println("Введенный рост меньше"+b );
        }
        else{
            out.println("Введенный рост больше "+b );
        }



        //char М,I;
        if (перваябукваимени == 'M') {
            out.println("Имя начинается с М");}

         else if (перваябукваимени == 'I') {
         out.println("Имя начинается с I");}


         else{
                out.println("Имя начинается не с M и не с I");
            }


        }
    }
