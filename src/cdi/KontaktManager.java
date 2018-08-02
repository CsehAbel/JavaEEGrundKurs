package cdi;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import interceptors.Logging;
import test.Test;

@Dependent
@Logging
public class KontaktManager{

	//Alternative-ok nincsenek felvéve 
	//a beans.xml-be, de KontaktProviderFactory-ban instance-oljuk
	//@Test Qualifier-es @Producer-es metódussal
	//a  TestKontaktProvider-t
	@Inject @Test @SessionScoped
	private KontaktProvider kontaktProvider;
	
	public List<String> getKontaktNamen(){
		
		return kontaktProvider.getKontaktNamen();
		//return kontakten;
	}
}
