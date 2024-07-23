package ab.repository.imported.tests;

import java.util.Collection;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.skyscreamer.jsonassert.JSONAssert;
import com.arcadsoftware.iunit.junit.xml.IUnitXMLParser;
import com.arcadsoftware.iunit.junit.model.Configuration;
import com.arcadsoftware.iunit.junit.model.ResourceManager;

@RunWith(value = Parameterized.class)
public class TEST1_ADD {

	static String inputXMLFilePath = "testcases/ab.repository.imported.tests/TEST1_ADD.xml";
	String input;
	String expectedResult;
	String compareJson;
	boolean isFailureAssertion = false;
	boolean isErrorAssertion = false;

	public TEST1_ADD(String input, String expectedResult, String compareJson) {
		this.input = input;
		this.expectedResult = expectedResult;
		this.compareJson = compareJson;
	}

	@Parameters
	public static Collection<String[]> testData() {
		return IUnitXMLParser.getParameters("resources/ab.repository.imported.tests/TEST1_ADD");
	}
}