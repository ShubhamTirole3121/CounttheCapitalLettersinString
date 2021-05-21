package Schoollevel;

public class CounttheCamelCaseCharc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ckjkUUYII";
		System.out.print(countCamelCase(s));

	}
	
	static int countCamelCase (String s)
    {
        // your code here 
       char[] ch =s.toCharArray();
      
        int count =0;
        
        for(int i=0; i<ch.length; i++){
            
            if(ch[i] >='A' && ch[i] <= 'Z' ){
                count++;
            }
        }
        return count;
        
    }

}
