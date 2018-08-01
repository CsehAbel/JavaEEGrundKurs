package cdi;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import test.Test;

@Dependent
public class KontaktManager {

	private KontaktProvider kontaktProvider;
	
	//a projektben KontaktProvideren k�v�l nincs
	//@Producer met�dus ami List<String> visszat�r�s�
	@Inject
	private List<String> kontakten;
	
	public List<String> getKontaktNamen(){
		//return kontaktProvider.getKontaktNamen();
		return kontakten;
	}
}
