import java.util.Random;

public class random{
    public static void main(String[] args){
	Random rand = new Random(11L);
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	rand.setSeed(10L);
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	rand.setSeed(11L);
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	System.out.println("N�mero al azar: "+rand.nextInt(15));
	System.out.println("N�mero al azar: "+rand.nextInt(15));
    }
}