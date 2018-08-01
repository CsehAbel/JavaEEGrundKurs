package cdi;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import test.Test;

@Dependent
public class KontaktManager {

	private KontaktProvider kontaktProvider;
	
	//a projektben KontaktProvideren kívûl nincs
	//@Producer metódus ami List<String> visszatérésû
	@Inject
	private List<String> kontakten;
	
	public List<String> getKontaktNamen(){
		//return kontaktProvider.getKontaktNamen();
		return kontakten;
	}
}
