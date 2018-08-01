package cdi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

@Dependent
public class KontaktProvider {
	
	@Produces
	private List<String> standardKontakte;

	public KontaktProvider(){
		standardKontakte=new ArrayList<String>(
								Arrays.asList(
								new String[]{"Peter","Jozsi","Marton","Abel"}
								));
	}
	
	public List<String> getKontaktNamen(){
		return standardKontakte;
	}
}
