package kr.co.ya_ong.dto;

public class BrandDTO {	//브랜드
	
	//멤버 필드
	private int brand_num;		// 브랜드 번호
	private String brand_name;	// 브랜드 이름
	private String brand_img;	// 브랜드 로고 이미지
	
	// getter, setter
	public int getBrand_num() {
		return brand_num;
	}
	public void setBrand_num(int brand_num) {
		this.brand_num = brand_num;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getBrand_img() {
		return brand_img;
	}
	public void setBrand_img(String brand_img) {
		this.brand_img = brand_img;
	}
	
}
