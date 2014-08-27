package v1ch4;

/**
 * Created by Eric on 8/27/2014.
 */
public class Exercise4_24 {
    public static void main(String[] args){
        double sum=0;
        for(int i=1;i<=97;i+=2){
            sum+=1.0*i/(i+2);
            System.out.println("sum is "+sum);
        }
    }
}
