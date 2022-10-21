public class BloodData{	
	static String bloodType;
	static String rhFactor;	
		
public BloodData(String bt, String rh){
	bloodType = "O";
	rhFactor = "+";	
}
public BloodData(){
}

public void display(){
	System.out.println(bloodType+rhFactor+ " is added to the blood bank.");
	}
}