package event;

import javax.enterprise.context.Dependent;
import javax.enterprise.event.Observes;

@Dependent
public class Consument {

	private void onElementAdded(@Observes String s){
		System.out.println("==> "+s+" hozzáadva.");
	}
}
