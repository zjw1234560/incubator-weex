package com.alibaba.weex.uitest.TC_AG;
import com.alibaba.weex.WXPageActivity;
import com.alibaba.weex.util.TestFlow;
import java.util.TreeMap;
import org.junit.Before;
import org.junit.Test;

public class AG_Input_Input_Autofocus extends TestFlow {
	public AG_Input_Input_Autofocus() {
		super(WXPageActivity.class);
	}

	@Before
	public void setUp() throws InterruptedException {
		super.setUp();
		TreeMap testMap = new <String, Object> TreeMap();
		testMap.put("testComponet", "AG_Input");
		testMap.put("testChildCaseInit", "AG_Input_Input_Autofocus");
		testMap.put("step1",new TreeMap(){
			{
				put("click", "true");
				put("screenshot", "AG_Input_Input_Autofocus_01_true");
			}
		});
		testMap.put("step2",new TreeMap(){
			{
				put("click", "false");
				put("screenshot", "AG_Input_Input_Autofocus_02_false");
			}
		});
		super.setTestMap(testMap);
	}

	@Test
	public void doTest(){
		super.testByTestMap();
	}

}
