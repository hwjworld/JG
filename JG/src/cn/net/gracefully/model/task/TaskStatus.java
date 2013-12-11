package cn.net.gracefully.model.task;

import com.google.code.morphia.annotations.Embedded;

@Embedded
public class TaskStatus {
	private boolean isFinish;

	public boolean isFinish() {
		return isFinish;
	}

	public void setFinish(boolean isFinish) {
		this.isFinish = isFinish;
	}
}
