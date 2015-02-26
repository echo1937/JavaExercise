package v1ch4;

/**
 * Created by Eric on 2/26/15.
 */
public class Exercise4_40 {
    public static void main(String[] args){
        int headCount=0;
        int tailCount=0;

        for(int i=0;i<10000;i++){
            int number=(int)(Math.random() * 10000) % 2;
                            //a pseudorandom double greater than or equal to 0.0 and less than 1.0.
            if (number==0)
                headCount++;
            else
                tailCount++;

        }
        System.out.println("headCount: "+headCount);
        System.out.println("tailCount: "+tailCount);
        System.out.println(Math.random());
    }
}
