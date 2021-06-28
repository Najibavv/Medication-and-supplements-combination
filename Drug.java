
public abstract class Drug {
	
	String DrugName1;
	String DrugName2;
	private String name;
	private int age;
	
	

    public Drug(String d, String d2) {
    	DrugName1=d;
    	DrugName2=d2;
    }
    
    public void setName(String n){
    	name=n;
    }
    
    public void setAge(int a){
   age=a;
    }
    
    public String getName(){
    	return name;
    }
    public int getAge(){
    	return age;
    }
    public String getDrugName(){
    	return DrugName1;
    }
    
    public String getDrugName2(){
    	return DrugName2;
    }
    
    //abstract method
    abstract void Result();
    
    public String toString(){
    	return "name is"+name+" age is "+age+" Drug 1 is: "+DrugName1+" Drug 2 is: "+DrugName2;
    }
    
}