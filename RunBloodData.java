import java.util.Scanner;
public class RunBloodData{
	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter blood type of patient: ");
	String input1 = input.nextLine();	
	if(input1.equals("A")||input1.equals("B")||input1.equals("O")||input1.equals("AB")){
	
	}
	
	System.out.println("Enter the Rhesus factor (+ or -): ");
	String input2 = input.nextLine();	
	if(input2.equals("+") || input2.equals("-")){
		}

	if (input1.isEmpty() || input2.isEmpty()){
	BloodData bd = new BloodData(input1, input2);
	bd.display();
	
		}
	else if(input1.isEmpty() || input2.isEmpty()){
	BloodData bd = new BloodData();
	bd.display();
		}
	}	
}
