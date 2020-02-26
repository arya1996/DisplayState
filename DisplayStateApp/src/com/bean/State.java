package com.bean;

public class State {
	private Integer no;
	private String stateName;
	
	public State() {
		// TODO Auto-generated constructor stub
	}

	public State(Integer no, String stateName) {
		super();
		this.no = no;
		this.stateName = stateName;
	}

	public State(String stateName) {
		super();
		this.stateName = stateName;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "State [no=" + no + ", stateName=" + stateName + "]";
	}
	
	

}
