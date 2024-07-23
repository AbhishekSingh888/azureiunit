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
public class T1_DIVIDE {

	static String inputXMLFilePath = "testcases/ab.repository.imported.tests/T1_DIVIDE.xml";
	String input;
	String expectedResult;
	String compareJson;
	boolean isFailureAssertion = false;
	boolean isErrorAssertion = false;

	public T1_DIVIDE(String input, String expectedResult, String compareJson) {
		this.input = input;
		this.expectedResult = expectedResult;
		this.compareJson = compareJson;
	}

	@Parameters
	public static Collection<String[]> testData() {
		return IUnitXMLParser.getParameters("resources/ab.repository.imported.tests/T1_DIVIDE");
	}
}