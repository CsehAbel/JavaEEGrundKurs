package cdi;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

import test.TestKontaktProvider;

@Dependent
public class KontaktProviderFactory {
	
	@Produces
	public KontaktProvider getProvider(){
		TestKontaktProvider provider=new TestKontaktProvider();
		provider.getKontaktNamen().add("Hegyes");
		provider.getKontaktNamen().add("Antal");
		return provider;
	}
}
