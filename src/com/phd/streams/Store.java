package com.phd.streams;

import java.util.List;

public class Store {

	private int storeId;
	private String storeName;
	private int deliveryDays;
	private List<String> servingZipCodes;
	private StoreAddress storeAddress;

	public Store() {
	}

	public Store(int storeId, String storeName, int deliveryDays, List<String> servingZipCodes,
			StoreAddress storeAddress) {
		this.storeId = storeId;
		this.storeName = storeName;
		this.deliveryDays = deliveryDays;
		this.servingZipCodes = servingZipCodes;
		this.storeAddress = storeAddress;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public int getDeliveryDays() {
		return deliveryDays;
	}

	public void setDeliveryDays(int deliveryDays) {
		this.deliveryDays = deliveryDays;
	}

	public List<String> getServingZipCodes() {
		return servingZipCodes;
	}

	public void setServingZipCodes(List<String> servingZipCodes) {
		this.servingZipCodes = servingZipCodes;
	}

	public StoreAddress getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(StoreAddress storeAddress) {
		this.storeAddress = storeAddress;
	}

}
