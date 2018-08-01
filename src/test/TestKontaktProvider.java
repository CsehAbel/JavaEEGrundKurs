package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;

import cdi.KontaktProvider;

@Dependent 
@Test
@Alternative
public class TestKontaktProvider extends KontaktProvider{

	private List<String> namen=new ArrayList<>();
	
	public TestKontaktProvider(){
		namen.add("Peter");
		namen.add("Tester");
		namen.add("Theresa");
	}
	
	@Override
	public List<String> getKontaktNamen() {
		// TODO Auto-generated method stub
		return namen;
	}
}
