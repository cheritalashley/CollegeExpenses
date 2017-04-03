package challenges;

public class MonteCarloChallenge {

	public static void main(String[] args) {
	
	System.out.println("100 trials: " + marble(100));	
	System.out.println("1000 trials: " + marble(1000));	
	System.out.println("1000 trials: " + marble(1000));
	}
	
	public static String marble(int numTrials){
		final int BLUE=1;
		final int WHITE=2;
		double number=0.0;
		double result=0.0;

		for (int t=0; t<numTrials; t++){
			result++;
			int[] bowl={BLUE,BLUE,BLUE,WHITE,WHITE,WHITE};
			int[] drawMarbles=new int[3];
			
			for(int draw=0; draw<3; draw++){
				int index=(int)(Math.random() * bowl.length);
				drawMarbles[draw]=bowl[index];
				int[] newBowl=new int[bowl.length-1];
				int j=0;
				for(int i=0;i<bowl.length; i++){
					if (i==index){
						continue;
					}
				newBowl[j]=bowl[i];
				j++;
				}
				bowl=newBowl;
			}	
			
			if(drawMarbles[0]==drawMarbles[1] && drawMarbles[1]==drawMarbles[2]){
				number++;
			}
		}
	return "Results:" + (number/result);
	}
	
}
