public class Linijka{
public static void main(String[] args) {

	int length = 3;
	int depth = 5;

	int number_of_units=(int)Math.pow(2,depth-1);

	for(int i=0; i<=(number_of_units*length); i++){
		if(i % number_of_units==0){
			System.out.print(i/number_of_units);
		}
		else{
			System.out.print(" ");
		}
	}

	System.out.println();

	for(int k=0; k<depth; k++){
		for(int j=0; j<length; j++){
			for(int i=0; i<number_of_units; i++){
				
				if(i % (int)Math.pow(2,depth-k-1)==0){
					System.out.print("|");
				}
				else{
					System.out.print(" ");
				}
			}

		}
		System.out.println("|");
	}
	}
}