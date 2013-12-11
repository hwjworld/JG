package cn.net.gracefully.repository;

import java.util.List;

import cn.net.gracefully.model.cond.Condition;
import cn.net.gracefully.model.task.Task;
import cn.net.gracefully.repository.JGRepository;

public interface TaskRepository extends JGRepository {
	public List<Task> getTaskList(Condition condition);
}
