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
public class MockKontaktProvider extends KontaktProvider{

	@Override
	public List<String> getKontaktNamen(){
		ArrayList<String> namen=new ArrayList<>();
		namen.add("Test-Peter");
		namen.add("Test-Matyas");
		namen.add("Test-Tamas");
		return namen;
	}
}

