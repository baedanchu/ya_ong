package kr.co.ya_ong.dto;

public class ProductDTO {	// 상품
	
	// 멤버 필드
	private int prod_num;				// 상품 번호
	private int sub_cate_num;			// 소분류 카테고리 번호
	private int brand_num;				// 브랜드 번호
	private String prod_name;			// 상품명 (브랜드명+상품명 표기)
	private int prod_cost;				// 제품 원가
	private int prod_price;				// 판매 가격
	private int prod_discount;			// 할인율
	private int prod_inventory;			// 재고
	private String prod_img;			// 상품 대표 이미지
	private String prod_img_detail;		// 상품 상세설명 이미지
	private String prod_explanation;	// 상품 설명
	private String prod_summary;		// 특징 및 요약
	private String prod_regdate;		// 상품 등록일
	
	// getter, setter
	public int getProd_num() {
		return prod_num;
	}
	public void setProd_num(int prod_num) {
		this.prod_num = prod_num;
	}
	public int getSub_cate_num() {
		return sub_cate_num;
	}
	public void setSub_cate_num(int sub_cate_num) {
		this.sub_cate_num = sub_cate_num;
	}
	public int getBrand_num() {
		return brand_num;
	}
	public void setBrand_num(int brand_num) {
		this.brand_num = brand_num;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getProd_cost() {
		return prod_cost;
	}
	public void setProd_cost(int prod_cost) {
		this.prod_cost = prod_cost;
	}
	public int getProd_price() {
		return prod_price;
	}
	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}
	public int getProd_discount() {
		return prod_discount;
	}
	public void setProd_discount(int prod_discount) {
		this.prod_discount = prod_discount;
	}
	public int getProd_inventory() {
		return prod_inventory;
	}
	public void setProd_inventory(int prod_inventory) {
		this.prod_inventory = prod_inventory;
	}
	public String getProd_img() {
		return prod_img;
	}
	public void setProd_img(String prod_img) {
		this.prod_img = prod_img;
	}
	public String getProd_img_detail() {
		return prod_img_detail;
	}
	public void setProd_img_detail(String prod_img_detail) {
		this.prod_img_detail = prod_img_detail;
	}
	public String getProd_explanation() {
		return prod_explanation;
	}
	public void setProd_explanation(String prod_explanation) {
		this.prod_explanation = prod_explanation;
	}
	public String getProd_summary() {
		return prod_summary;
	}
	public void setProd_summary(String prod_summary) {
		this.prod_summary = prod_summary;
	}
	public String getProd_regdate() {
		return prod_regdate;
	}
	public void setProd_regdate(String prod_regdate) {
		this.prod_regdate = prod_regdate;
	}
	

}
