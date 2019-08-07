package interviewPrograms;

public class JaggedArray {

	public static void main(String[] args) {
		
		int[][] twoDarray = new int[4][];
		
		twoDarray[0] = new int[1];
		twoDarray[1] = new int[2];
		twoDarray[2] = new int[3];
		twoDarray[3] = new int[4];
		
		int count =0;
		for(int i=0;i<twoDarray.length;i++) {
			for(int j=0;j<twoDarray[i].length;j++) {
				twoDarray[i][j] = count++;
				
			}
		}
		
		for(int i=0;i<twoDarray.length;i++) {
			for(int j=0;j<twoDarray[i].length;j++) {
                System.out.print(twoDarray[i][j] + " "); 
                
				
			}
			System.out.println(); 
		}
		
		
		
		
	

	}

}
