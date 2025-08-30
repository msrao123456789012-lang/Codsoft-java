import java.util.*;
public class Task2
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> dictmarks=new HashMap<>();
		System.out.print("Enter no of students:");
		int num=sc.nextInt();
		for(int k=0;k<num;k++){
		System.out.print("Enter student name:");
		String name=sc.nextLine();
		System.out.print("enter no .of subjects: ");
		int n=sc.nextInt();
		int total=0;
		for(int i=0;i<n;i++){
		    System.out.print("enter subject name:");
		    String sub=sc.next();
		    System.out.print("enter marks of "+sub+":");
		    int marks=sc.nextInt();
		    if(marks<0 || marks>100){
		        System.out.println("Please enter valid marks from range 0-100");
		    }
		    dictmarks.put(sub,marks);
		    total+=marks;
		   }
		   double percentage=(total)/n;
		  //stem.out.println(percentage);
		  String grade;
		  if(percentage>=90){
		      grade="A+";
		  }
		  else if(percentage>=80){
		      grade="B+";
		  }
		  else if(percentage>=70){
		      grade="C+";
		  }
		  else if(percentage>=60){
		      grade="D+";
		  }
		  else if(percentage>=35){
		      grade="D";
		  }
		  else{
		      grade="FAIL";
		  }
		  for(int j=0;j<=9;j++){
		   System.out.print("===");
		  }
		  System.out.println();
		  System.out.println("    "+"RESULTS:"+name.toUpperCase());
		  for(int j=0;j<=9;j++){
		   System.out.print("===");
		   
		  }
		  System.out.println();
		  for(Map.Entry<String,Integer> entry:dictmarks.entrySet()){
		      System.out.println("  "+(entry.getKey()).toUpperCase()+":"+entry.getValue());
		  }
		  System.out.println("   TOTAL:"+total);
		  System.out.println("   GRADE:"+grade);
	}
	}
}
