package customapis;


import java.util.logging.Logger;

import com.provar.core.model.base.api.ValueScope;
import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.*;

@TestApi( title="Random"
        , summary="Returns a random integer in the interval from 0 (inclusive) to 'max' (exclusive)"
        , remarks=""
        , iconBase=""
        , defaultApiGroups={"ARPEDIO Custom APIs"}
        )
@TestApiParameterGroups(parameterGroups={
	    @TestApiParameterGroup(groupName="inputs", title="Inputs"),
	    @TestApiParameterGroup(groupName="result", title="Result"),
	    })
public class Random {
    
    @TestApiParameter(seq=1, 
            summary="The upper limit for the random integer",
            remarks="",
            mandatory=true,
            parameterGroup="inputs")
    public Integer max;
    
    @TestApiParameter(seq=2, 
            summary="An offset to be added to the random number (does not affect the upper limit)",
            remarks="",
            mandatory=false,
            parameterGroup="inputs")
    public Integer offset;
    
    @TestApiParameter(seq=10, 
            summary="The name that the result will be stored under.",
            remarks="",
            mandatory=true,
            parameterGroup="result")
    public String resultName;

    @TestApiParameter(seq=11, 
            summary="The lifespan of the result.",
            remarks="",
            mandatory=true,
            parameterGroup="result",
            defaultValue="Test")
    public ValueScope resultScope;

    /** 
     * Used to write to the test execution log.
     */
    @TestLogger
    public Logger testLogger;
    
    /** 
     * Provides access to facilities, mainly to set and get variable values.
     */
    @TestExecutionContext
    public ITestExecutionContext testExecutionContext;
    
    @TestApiExecutor
    public void execute() {

    	Integer result = new java.util.Random().nextInt(max);
    	result += offset == null ? 0 : offset;
        testExecutionContext.setValue(resultName, result, resultScope);
        
    }
    
}
