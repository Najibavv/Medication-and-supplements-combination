
public class Supplements extends Drug implements ComboInterface{

    public Supplements(String d, String d2){
    	super(d,d2);
    }
    
    
    
     void Result(){
     	
     	if((getDrugName().equalsIgnoreCase("Calcium")&&getDrugName2().equalsIgnoreCase("magnesium"))||(DrugName1.equalsIgnoreCase("magnesium")&&DrugName2.equalsIgnoreCase("Calcium")))
     		System.out.println("taking large amounts of minerals with other minerals will reduce absorption its best if you take them in two hours part");
     		
   else if((DrugName1.equalsIgnoreCase("Copper")&&DrugName2.equalsIgnoreCase("Zinc"))||(DrugName1.equalsIgnoreCase("zinc")&&DrugName2.equalsIgnoreCase("copper")))
  	System.out.println("zinc can interfere with copper absorption");
  	
  	else if((DrugName2.equalsIgnoreCase("Folate")&&DrugName2.equalsIgnoreCase("B 12"))||(DrugName1.equalsIgnoreCase("B12")&&DrugName2.equalsIgnoreCase("Folate")))
  			System.out.println("what primarily happens is that you can have a vitamin deficiency in B12 but not know it because the folate interferes with the testing");
  			
  			else 
  			System.out.println("As long as we know its safe to take "+DrugName1+" and "+DrugName2);	}
  		
public  void displayAdvice(){
   	System.out.println("Watch Your Dosage");
   		System.out.println("Take As Directed");
   		System.out.println("Read Labels Carefully");
   			System.out.println("Never Substitute for Food");
   				System.out.println("Keep Supplements and Medicines Properly Stored");
   }
   
public   String toString(){
	return super.toString();
}
   
    
}