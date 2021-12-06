public class Cycle {
    public static void main (String[] args){

        for (int i=0;i<=20;i+=1)
            System.out.print(" "+i);

        System.out.println();

        int j=-6;
        while (j<=6) {
            System.out.print(" "+j);
            j+=2;

        }
        System.out.println();
        int x=10;
        int result = 0;
        do {

            if(x%2!=0)

                result=result+x;
            x++;


        } while (x<=20);
        System.out.print(" "+result);
    }

}

