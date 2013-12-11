package cn.net.gracefully.repository;

import java.util.List;

import org.bson.types.ObjectId;

import cn.net.gracefully.model.cond.Condition;
import cn.net.gracefully.model.matter.Matter;

import com.google.code.morphia.Key;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Indexed;
import com.google.code.morphia.query.Query;
import com.google.code.morphia.utils.IndexDirection;

public class MattersRepositoryImpl implements MattersRepository {


	@Override
	public List<Matter> getMatterList(Condition condition) {
		Query<Matter> query = ds.createQuery(Matter.class);
//		Place place1 = new Place("place1", new double[] {1,1});
//		ds.save(place1);
//
//		Place found = ds.find(Place.class).field("loc").near(0, 0).get();
		return query.asList();
	}
	@Entity
	static private class Place {
	        @Id protected ObjectId id;
	        protected String name = "";
	        @Indexed(IndexDirection.GEO2D)
	        protected double[] loc = null;
	        
	        public Place(String name, double[] loc) {
	                this.name = name;
	                this.loc = loc; }

	        private Place() {}
	}
	@Override
	public String addMatter(Matter matter) {
		Key<Matter> key = ds.save(matter);
		return key.toString();
	}


}
