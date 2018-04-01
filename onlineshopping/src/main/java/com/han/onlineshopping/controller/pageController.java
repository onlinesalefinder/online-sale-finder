package com.han.onlineshopping.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.han.onlineshopping.services.RegService;
import com.han.onlineshopping.vo.Category;
import com.han.onlineshopping.vo.Item;
import com.han.onlineshopping.vo.Shop;

@Controller
public class pageController {
	@Autowired
	RegService service;
	HttpServletRequest request;
	
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClicksHome", true);
		return mv;
	}

	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClicksAbout", true);
		return mv;
	}

	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClicksContact", true);
		return mv;
	}

	@RequestMapping("/signup")
	public ModelAndView signup() {
		List cities = service.getCity();
		return new ModelAndView("signup", "shop", new Shop()).addObject("cities",
				cities);
	}

	@RequestMapping(value="/register" , method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("shop") Shop shop) {
		System.out.println(shop);
		/*Shop returnShop=*/
		service.saveShop(shop);
		return new ModelAndView("dashboard");
	}
	
	@RequestMapping(value="/verify")
	public ModelAndView verify(@ModelAttribute("shop") Shop shop) {
		return new ModelAndView("dashboard");
	}
	
	@RequestMapping(value="/addCategory")
	public ModelAndView addCategory(){
		return new ModelAndView("addCategory","category",new Category());
	}

	@RequestMapping(value="/saveCategory")
	public ModelAndView saveCategory(@ModelAttribute("category") Category category){
		service.saveCategory(category);
		return new ModelAndView("dashboard");
	}

	@RequestMapping(value="/addItem")
	public ModelAndView addItem(){
		List categories=service.getCategories();
		return new ModelAndView("addItem","item",new Item()).addObject("categories",categories);
	}
	
	@RequestMapping(value="/saveItem")
	public ModelAndView saveItem(@ModelAttribute("item") Item item){
		service.saveItem(item);
		return new ModelAndView("dashboard");
	}
	
/*	@RequestMapping("/signin")
	public ModelAndView signin() {
		return new ModelAndView("signin", "shop", new Shop());
	}

	@RequestMapping("/verify")
	public ModelAndView verify() {
		
		 * 
		 * Here You have to writ a code to verify and send to dashboard with
		 * list of their products and save the shop in session and name the attribute as shop;
		 
		
		return new ModelAndView();
	}

	@RequestMapping("/addproduct")
	public ModelAndView addProduct() {
		List categories = new ArrayList();
		HttpSession session = request.getSession();
		Shop shop = (Shop) session.getAttribute("shop");
		Product product = new Product();
		product.setShop(shop);
		return new ModelAndView("addproduct", "product", product )
				.addObject("categories", categories);
	}

	@RequestMapping(value = "/saveproduct", method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute("product") Product product,
			@RequestBody Images images[]) {
		//Product p =service.saveProduct(product);
		//service.saveImages(images, p);
		return new ModelAndView();
	}
*/
}
