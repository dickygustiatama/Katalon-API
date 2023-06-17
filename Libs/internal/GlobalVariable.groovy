package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseURL
     
    /**
     * <p></p>
     */
    public static Object email
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object userId
     
    /**
     * <p></p>
     */
    public static Object listUserPageNum
     
    /**
     * <p></p>
     */
    public static Object putUpdateName
     
    /**
     * <p></p>
     */
    public static Object putUpdateJob
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            baseURL = selectedVariables['baseURL']
            email = selectedVariables['email']
            password = selectedVariables['password']
            userId = selectedVariables['userId']
            listUserPageNum = selectedVariables['listUserPageNum']
            putUpdateName = selectedVariables['putUpdateName']
            putUpdateJob = selectedVariables['putUpdateJob']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
