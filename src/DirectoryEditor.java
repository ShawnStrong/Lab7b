
import java.util.*;

public class DirectoryEditor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean off = false;
		Scanner console = new Scanner(System.in);
		String in;
		MainDirectory s = new MainDirectory();
		
		while(!off){
			System.out.println("Enter a command CLR, ADD, END");
			in = console.nextLine();
			if(in.equalsIgnoreCase("add")){
				s.add();
			}else if(in.equalsIgnoreCase("print")){
				s.print();
			}else if(in.equalsIgnoreCase("clr")){
				s.clear();
			}else if(in.equalsIgnoreCase("end")){
				
			}else{
				System.out.println("Wrong command");
			}
			
			
			
			off = false;
		}
		console.close();
	}

}
