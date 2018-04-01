package com.han.onlineshopping.services;

import java.util.List;

import com.han.onlineshopping.vo.Category;
import com.han.onlineshopping.vo.Item;
import com.han.onlineshopping.vo.Shop;

public interface RegService {

	Shop saveShop(Shop shop);

	List getCity();

	void saveCategory(Category category);

	void saveItem(Item item);

	/*Product saveProduct(Product product);

	void saveImages(Images[] images, Product p);
*/
}
