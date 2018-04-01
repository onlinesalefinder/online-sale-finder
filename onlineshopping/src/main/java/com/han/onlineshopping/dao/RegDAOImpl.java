package com.han.onlineshopping.dao;




import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.han.onlineshopping.vo.Category;
import com.han.onlineshopping.vo.Item;
import com.han.onlineshopping.vo.Shop;


@Repository
public class RegDAOImpl implements RegDAO {

	@Autowired
	SessionFactory sf;
	
	@Transactional
	public Shop saveShop(Shop shop) {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		System.out.println("hello");
		/*City city = new City();
		city.setCityId(1);
		city.setCityName("ahmedabad");
		*/
		/*State state = new State();
		state.setStateId(1);
		state.setStateName("Gujarat");*/
		Transaction tr = session.beginTransaction();
	//	session.save(state);
		//session.save(city);
		session.save(shop);
		tr.commit();
		session.close();
		Shop returnShop = shop;
		return returnShop;
	}/*
	public Product saveProduct(Product1 product) {
		// TODO Auto-generated method stub
		Session session =sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(product);
		tr.commit();
		session.close();
		Product returnProduct =product;
		return returnProduct;
	}
	public void saveImages(Images[] images, Product p) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for(int i=0; i<=images.length;i++)
		{
			images[i].setProduct(p);
			session.save(images[i]);
		}
		tr.commit();
		session.close();
	}
*/

	public List getCity() {
		// TODO Auto-generated method stub
		Session  session = sf.openSession();
		Query q = session.createQuery("from City");
		List cities = q.getResultList();
		session.close();
		return cities;
	}

	public boolean verify(Shop shop) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Query q = session.createQuery("from Shop where phoneNo="+shop.getPhoneNo()+" and password="+shop.getPassword());
		List list = q.getResultList();
		boolean isValid=false;
		if(list.size() !=0)
		{
			isValid=true;
		}
		session.close();
		return isValid;
	}

	public void saveCategory(Category category) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tr =  session.beginTransaction();
		session.save(category);
		tr.commit();
		session.close();
	}

	public void saveItem(Item item) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tr =  session.beginTransaction();
		session.save(item);
		tr.commit();
		session.close();
	}
	public List getCategories() {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Query q = session.createQuery("from Category");
		List categories = q.getResultList();
		session.close();
		return categories;
	}
	
}
