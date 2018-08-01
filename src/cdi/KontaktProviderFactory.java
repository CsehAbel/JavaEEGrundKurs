package cdi;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

import test.Test;
import test.TestKontaktProvider;

@Dependent
public class KontaktProviderFactory {
	
	@Produces @Test
	public KontaktProvider getProvider(){
		TestKontaktProvider provider=new TestKontaktProvider();
		provider.getKontaktNamen().add("Hegy");
		provider.getKontaktNamen().add("Antal");
		SimpleDateFormat datum=new SimpleDateFormat("HH:mm:ss");
		provider.getKontaktNamen().add(datum.format(new Date()));
		return provider;
	}
}
