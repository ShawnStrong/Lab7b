import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class MainDirectory implements Directory{
	LinkedList<Employee> sort = new LinkedList<>();
	

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	void reconstruct(String s){
		Gson g = new Gson();
		ArrayList<Employee> ep = (g.fromJson(s, new TypeToken<Collection<Employee>>(){}.getType()));
		for (Employee pp: ep) {
			pp.print();
		}

	}
}
