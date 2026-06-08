import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){

		System.out.println("Enter number of students: ");
		int numStudent = input.nextInt();

		System.out.println("Enter number of subjects: ");
		int numSubject = input.nextInt();

		System.out.println("Saving>>>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfully");


		


		int[][] scores = new int[numStudent][numSubject];

		for(int student = 0; student < numStudent; student++){
			for(int subject = 0; subject < numSubject; subject++){
				int score;
				do{ System.out.println("Entering score for student " + (student + 1));
				    System.out.println("Entering score for subject " + (subject + 1));
				    score = input.nextInt();
			            }
				while(score > 100 || score < 0);	
				scores[student][subject] = score;

}

}

		int[] totals = new int[numStudent];
		double[] averages = new double[numStudent];

		for(int student = 0; student < numStudent; student++){
			int total = 0;
			for(int subject = 0; subject < numSubject; subject++){
				total += scores[student][subject];		
}
		totals[student] = total;
		averages[student] = total/numSubject;
}

		int[] positions = new int[numStudent];

		for(int currentStudent = 0; currentStudent < numStudent; currentStudent++){
			int position = 1;
			for(int nextStudent = 0; nextStudent < numStudent; nextStudent++){
				if(averages[nextStudent] > averages[currentStudent]){
					position++;
}

}
			positions[currentStudent] = position;
}

	System.out.println("==========================================================");

	System.out.print("STUDENT\t");

	for(int subject = 0; subject < numSubject; subject++){
    	System.out.print("SUB" + (subject + 1) + "\t");
	}

	System.out.println("TOT\tAVE\tPOS");

	System.out.println("==========================================================");

	for(int student = 0; student < numStudent; student++){

    		System.out.print("Student " + (student + 1) + "\t");
	
    		for(int subject = 0; subject < numSubject; subject++){
        		System.out.print(scores[student][subject] + "\t");
    		}

    		System.out.printf("%d\t%.2f\t%d%n",
            		totals[student],
            		averages[student],
            		positions[student]);
	}









}
}