package lists.find.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

/**
 * Example for find all Teammates by authorized.
 *
 * */
public class FindTeammateByAuthenticity {

	/** 
	 * main: start FindTeammateByAuthenticity.
	 * @param args String[] for args */
	public static void main(final String[] args) {

		Teammate dv0101 = new Teammate();
		dv0101.setName("DALiE");
		dv0101.setLastName("dalie01");
		dv0101.setAuthorized(true);

		Teammate dv0102 = new Teammate();
		dv0102.setName("DALiE");
		dv0102.setLastName("dalie02");
		dv0102.setAuthorized(false);
	
		Teammate dv0103 = new Teammate();
		dv0103.setName("DALiE");
		dv0103.setLastName("dalie03");
		dv0103.setAuthorized(true);
	
		List<Teammate> allTeammates = new ArrayList<Teammate>();
		allTeammates.add(dv0101);
		allTeammates.add(dv0102);
		allTeammates.add(dv0103);
		
		Predicate isAuthorized = new Predicate() {
		    @Override
			public boolean evaluate(final Object teammate) {
		    	if (teammate instanceof Teammate) {
					return ((Teammate)teammate).isAuthorized();
				} else {
					return false;
				}
		    }
		};

		Collection<?> selected = CollectionUtils.select(allTeammates, isAuthorized);
		System.out.println(selected.size());
		for (Object object : selected) {
			System.out.println(((Teammate)object).getLastName());
		}
	}
	
} /*class FindUserByAuthorized*/
