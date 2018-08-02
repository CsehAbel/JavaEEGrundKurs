package cdi;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import decorators.KontaktHandler;
import interceptors.Logging;
import test.Test;

@Dependent
@Logging
public class KontaktManager implements KontaktHandler{

	//Alternative-ok nincsenek felvéve
	//a beans.xml-be, de KontaktProviderFactory-ban instance-oljuk
	//@Test Qualifier-es @Producer-es metódussal
	//a  TestKontaktProvider-t
	@Inject @Test @SessionScoped
	private KontaktProvider kontaktProvider;
	
	/* (non-Javadoc)
	 * @see cdi.KontaktHandler#getKontaktNamen()
	 */
	@Override
	public List<String> getKontaktNamen(){
		return kontaktProvider.getKontaktNamen();
	}
}
