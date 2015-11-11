/**
 * 
 */
package com.mimo.api;

/**
 * @author jack
 *
 */
public interface CaseService {

    public CaseVo getCase(String testCaseKey);

    public int writeOutputActual(String testCaseKey, String outputActual);

    public int writeTestResult(String testCaseKey, String result);

    public int writeRunningLog(String testCaseKey, String log);
}
