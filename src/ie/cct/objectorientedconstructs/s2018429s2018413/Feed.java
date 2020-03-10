
//@author Luiz

package ie.cct.objectorientedconstructs.s2018429s2018413;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ie.cct.objectorientedconstructs.FeedInterface;
import ie.cct.objectorientedconstructs.FeedItem;

public class Feed implements FeedInterface {
	
	private Collection<FeedItem> items;
	
	
	public Feed (Collection<FeedItem> items) {
		this.items = items;
	}
	
	//ArrayList<FeedItem> Collection = new ArrayList<FeedItem>();
	
	

	@Override
	public Collection<String> listTitles() {
		// TODO Auto-generated method stub
		this.items;
	}

	@Override
	public FeedItem getItem(String title) {
		// TODO Auto-generated method stub
		return getItem(title);
	}

	@Override
	public int numItems() {
		// TODO Auto-generated method stub
		return num;
	}

	@Override
	public Collection<FeedItem> findItems(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
