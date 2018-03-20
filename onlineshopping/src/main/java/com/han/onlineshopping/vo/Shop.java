package com.han.onlineshopping.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="shopDetails")
public class Shop {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int shopId;
private int shopName;
private String address;
private String logIn;
private String password;
private String phoneNo;
@ManyToOne
City city;
public int getShopId() {
	return shopId;
}
public void setShopId(int shopId) {
	this.shopId = shopId;
}
public int getShopName() {
	return shopName;
}
public void setShopName(int shopName) {
	this.shopName = shopName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public City getCity() {
	return city;
}
public void setCity(City city) {
	this.city = city;
}


}
