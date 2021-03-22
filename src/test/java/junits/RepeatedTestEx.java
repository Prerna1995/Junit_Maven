package junits;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestEx {
	
	@DisplayName("Example of Repeated test")
    @RepeatedTest(4)
	public void junit() {
		System.out.println("Inside Junit1");
	}

}
