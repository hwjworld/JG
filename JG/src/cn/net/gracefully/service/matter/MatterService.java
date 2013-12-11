package cn.net.gracefully.service.matter;

import java.util.List;

import cn.net.gracefully.model.cond.Condition;
import cn.net.gracefully.model.matter.Matter;

public interface MatterService {
	public String addMatter(Matter matter);
	public List<Matter> getMatters(Condition condition);
}
