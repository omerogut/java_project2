import java.util.Scanner;

public class BmiTest {

	public static void main(String[] args) {
		
		Bmi[] bmi1=new Bmi[3];
		Scanner sc = new Scanner(System.in);
		int size=3;
		for(int i=0;i<size;i++) {
			bmi1[i]=new Bmi();
            
			System.out.println("---ENTER PERSON "+ (i+1)+"'S VALUES---");
			System.out.println("Enter name, age, weight, height:");
			String person=sc.nextLine();			
			
		    String[] Value=substringMethod(person);
            String name = (Value[0]+" "+Value[1]);	
            int age=(Integer.parseInt(Value[2]));
            double weight=(Double.parseDouble(Value[3]));
            double height=(Double.parseDouble(Value[4]));
            
            bmi1[i].setName(name);
            bmi1[i].setAge(age);
            bmi1[i].setWeight(weight); 
            bmi1[i].setHeight(height);
        
        }
        for(int i=0;i<size;i++) {
		System.out.println("** The BMI result for "+bmi1[i].getName()+" ( Age: "+bmi1[i].getAge()+" Weight: "+bmi1[i].getWeight()+"  Height: "+bmi1[i].getHeight()+ ") is ");
   	    System.out.println(bmi1[i].getStatus());
   	    
        }
   	    sc.close();
 }
   
	public static String[] substringMethod(String value) {
    	String str=" ";
		String[] array = new String[5];
		int start=0,end,i=0;
		
		end=value.indexOf(str,start);
		while(end!=-1) {
			String values=value.substring(start,end);
			array[i]=values;
			
		start=end+1;
		end=value.indexOf(str,start);
		i++;
		}
    	String values=value.substring(start);
        array[i]=values;
        
        
        return array;
    	  
    }

    public static String[] splitMethod(String value) {
		
		return value.split(" ");		

	}

}
