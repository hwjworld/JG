package cn.net.gracefully.service.matter;

import java.util.List;

import cn.net.gracefully.model.cond.Condition;
import cn.net.gracefully.model.matter.Matter;
import cn.net.gracefully.repository.MattersRepositoryImpl;

public class MatterServiceImpl implements MatterService {

	@Override
	public String addMatter(Matter matter) {
		MattersRepositoryImpl r = new MattersRepositoryImpl();
		return r.addMatter(matter);
	}

	@Override
	public List<Matter> getMatters(Condition condition) {
		MattersRepositoryImpl r = new MattersRepositoryImpl();
		return r.getMatterList(condition);
	}

}
