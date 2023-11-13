package kr.co.ya_ong.dto;

public class Sub_cateDTO {	// 소분류 카테고리
	
	// 멤버 필드
	private int main_cate_num;		// 대분류 카테고리 번호
	private int sub_cate_num;		// 소분류 카테고리 번호
	private String sub_cate_name;	// 소분류 카테고리 이름
	
//	// 대분류 카테고리 이름
//	private String main_cate_name;
	
	// getter, setter
	public int getMain_cate_num() {
		return main_cate_num;
	}
	public void setMain_cate_num(int main_cate_num) {
		this.main_cate_num = main_cate_num;
	}
	public int getSub_cate_num() {
		return sub_cate_num;
	}
	public void setSub_cate_num(int sub_cate_num) {
		this.sub_cate_num = sub_cate_num;
	}
	public String getSub_cate_name() {
		return sub_cate_name;
	}
	public void setSub_cate_name(String sub_cate_name) {
		this.sub_cate_name = sub_cate_name;
	}
//	public String getMain_cate_name() {
//		return main_cate_name;
//	}
//	public void setMain_cate_name(String main_cate_name) {
//		this.main_cate_name = main_cate_name;
//	}
	
}
