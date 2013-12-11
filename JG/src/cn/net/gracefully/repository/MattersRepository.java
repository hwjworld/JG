package cn.net.gracefully.repository;

import java.util.List;

import cn.net.gracefully.model.cond.Condition;
import cn.net.gracefully.model.matter.Matter;


public interface MattersRepository extends JGRepository {

	public List<Matter> getMatterList(Condition condition);
	public String addMatter(Matter matter);

}
