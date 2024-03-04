package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
		private int productId;
		private String productName;
		private String productType;
		private long productPrice;
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getProductType() {
			return productType;
		}
		public void setProductType(String productType) {
			this.productType = productType;
		}
		public long getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(long productPrice) {
			this.productPrice = productPrice;
		}
		
	
}
