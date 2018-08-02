package decorators;

import java.util.List;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.interceptor.Interceptor;

@Decorator
@Priority(Interceptor.Priority.APPLICATION+100)
@Dependent
public class KontaktDecorator implements KontaktHandler {

	@Inject @Any 
	@Delegate
	private KontaktHandler handler;
	
	@Override
	public List<String> getKontaktNamen() {
		List<String> namen=handler.getKontaktNamen();
		namen.add("==> Decorator");
		return namen;
	}

}
