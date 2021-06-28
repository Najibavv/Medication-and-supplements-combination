import java.util.Scanner;

public class smcTest{
        
  
    public static void main(String[] args) {
    	
    	String userName;
    	int userAge;
    	int type;
    	
        Scanner user=new Scanner(System.in);
        System.out.println("Wellcome to Medication and supplements combo program");
        System.out.println("Please provide us with your name and age");
        userName=user.next();
        userAge=user.nextInt();
        
        System.out.println("choose which type of pills \n1-Medication\n2-Suppelemnts");
        type=user.nextInt();
        
        if(type==1){
        	
        	System.out.println("Provid us with the name of medication please [enter two names]");
        	Medication m=new Medication(user.next(),user.next());
        	m.setName(userName);
        	m.setAge(userAge);
        	m.Result();
        	System.out.println("These are tips for taking medication:");
        	m.displayAdvice();
        	
        }
        
        else if(type==2){
        		System.out.println("Provid us with the name of supplements please [enter two names]");
        		Supplements s=new Supplements(user.next(), user.next());
        		s.Result();
        		System.out.println("These are tips for taking Supplements:");
        	s.displayAdvice();
        }
        
        
       System.out.println("-------------"); 
       	 System.out.println(); 
       	 	
       	 	
       System.out.println("Dear "+userName+" wishing you a healthy life"); 
    }
}
