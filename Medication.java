
public class Medication extends Drug implements ComboInterface{

    public Medication(String d, String d2) {
    	super(d,d2);
    }
    
    
    
public void Result(){
if((DrugName1.equalsIgnoreCase("VitaminK")&&DrugName2.equalsIgnoreCase("bloodThinners"))||(DrugName1.equalsIgnoreCase("Blood thinners")&&DrugName2.equalsIgnoreCase("VitaminK")))
     		System.out.println("can counteract a blood thinner’s benefits");
     		
   else if((DrugName1.equalsIgnoreCase("diabetes")&&DrugName2.equalsIgnoreCase("CoQ10"))||(DrugName1.equalsIgnoreCase("CoQ10")&&DrugName2.equalsIgnoreCase("diabetes")))
  	System.out.println("this can cause dangerously low blood pressure");
  	
  	else if((DrugName1.equalsIgnoreCase("antibiotics")&&DrugName2.equalsIgnoreCase("iron"))||(DrugName1.equalsIgnoreCase("Iron")&&DrugName2.equalsIgnoreCase("antibiotics")))
  			System.out.println("Taking antibiotics along with iron supplements can dampen the effects of the antibiotics, making them less likely to work");
  			
  			else 
  			System.out.println("As long as we know its safe to take "+DrugName1+" and "+DrugName2);	}
  				
  				public void displayAdvice(){
   	System.out.println("Always carry a list of your medications and doses.");
   		System.out.println("When your doctor prescribes a new medicine, tell him about any other drugs you are taking. This includes over-the-counter drugs and vitamin supplements.");
   			System.out.println("Don’t Ignore Reactions");
   				System.out.println("Don’t mix your medications with food or drink unless instructed to by your doctor or pharmacist.");
   
  		
   
}

public String toString(){
	return super.toString();
}

}