package com.han.onlineshopping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.han.onlineshopping.dao.RegDAO;
import com.han.onlineshopping.vo.Category;
import com.han.onlineshopping.vo.Item;
import com.han.onlineshopping.vo.Shop;

@Service
public class RegServiceImpl implements RegService {
	@Autowired
	RegDAO dao;
	
	public Shop saveShop(Shop shop) {
		// TODO Auto-generated method stub
		Shop returnShop=dao.saveShop(shop);
		
		return returnShop;
	}

	public List getCity() {
		// TODO Auto-generated method stub
		List cities = dao.getCity();
		return cities;
	}

	public void saveCategory(Category category) {
		// TODO Auto-generated method stub
		dao.saveCategory(category);
	}

	public void saveItem(Item item) {
		// TODO Auto-generated method stub
		dao.saveItem(item);
	}

	public List getCategories() {
		// TODO Auto-generated method stub
		List categories = dao.getCategories();
		return categories;
	}

	/*public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		Product p = dao.saveProduct(product);
		return p;
	}

	public void saveImages(Images[] images, Product p) {
		// TODO Auto-generated method stub
		dao.saveImages(images, p);
	}
*/
}
