package event;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

import cdi.KontaktProvider;
import interceptors.Logging;
import test.Test;

@Dependent 
@Test
public class TestKontaktProvider extends KontaktProvider implements Serializable{
	private static final long serialVersionUID = 8575081735566522312L;

	private List<String> namen=new ArrayList<>();
	
	@Inject @Any
	private Event<String> event;
	
	@PostConstruct // after dependency injection is done ,Konstruktor elõtt nem lehet használni
	private void init(){	//public TestKontaktProvider(){
		add("Peter1");
		add("Tester");
		add("Theresa");
	}
	
	private void add(String s){
		namen.add(s);
		event.fire(s);
	}
	
	@Override
	public List<String> getKontaktNamen() {
		return namen;
	}
}
