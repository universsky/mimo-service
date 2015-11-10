/**
 * 
 */
package com.mimo.api;

import java.io.Serializable;
import java.util.Date;

/**
 * @author jack
 *
 */
public class CaseVo implements Serializable {

	private static final long serialVersionUID = 7841742705093339814L;

	private Integer id;

	private String caseKey;

	private String inputParams;

	private String outputExpected;

	private String outputActual;

	private String project;

	private String module;

	private String function;

	private String description;

	private String owner;

	private Date gmtCreate;

	private Date gmtModify;

	private String testResult;

	private String log;

	@Override
	public String toString() {
		return "CaseVo [id=" + id + ", caseKey=" + caseKey + ", inputParams=" + inputParams + ", outputExpected="
				+ outputExpected + ", outputActual=" + outputActual + ", project=" + project + ", module=" + module
				+ ", function=" + function + ", description=" + description + ", owner=" + owner + ", gmtCreate="
				+ gmtCreate + ", gmtModify=" + gmtModify + ", testResult=" + testResult + ", log=" + log + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCaseKey() {
		return caseKey;
	}

	public void setCaseKey(String caseKey) {
		this.caseKey = caseKey == null ? null : caseKey.trim();
	}

	public String getInputParams() {
		return inputParams;
	}

	public void setInputParams(String inputParams) {
		this.inputParams = inputParams == null ? null : inputParams.trim();
	}

	public String getOutputExpected() {
		return outputExpected;
	}

	public void setOutputExpected(String outputExpected) {
		this.outputExpected = outputExpected == null ? null : outputExpected.trim();
	}

	public String getOutputActual() {
		return outputActual;
	}

	public void setOutputActual(String outputActual) {
		this.outputActual = outputActual == null ? null : outputActual.trim();
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project == null ? null : project.trim();
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module == null ? null : module.trim();
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function == null ? null : function.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner == null ? null : owner.trim();
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModify() {
		return gmtModify;
	}

	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult == null ? null : testResult.trim();
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log == null ? null : log.trim();
	}

}
