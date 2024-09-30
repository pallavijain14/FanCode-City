package org.main.fancode.dto;

public class TodoDto {

    private boolean completed;

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "TodoDto [completed=" + completed + "]";
	}
    
}
