package test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;

import cdi.KontaktProvider;
import interceptors.Logging;

@Dependent 
@Test
@Alternative
public class TestKontaktProvider extends KontaktProvider implements Serializable{

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
