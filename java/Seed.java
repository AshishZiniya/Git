import java.util.Random;

class Seed{
	public static void main(String[] args){
			Random A = new Random();
			A.setSeed(1000);
			for(int i=0; i<100; i++){
				System.out.format(A.nextInt(49));
				if((i+1)%20==0){
					System.out.println();
   				}
			}
		}
}