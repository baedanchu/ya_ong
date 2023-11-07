package kr.co.ya_ong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Admin_ProdController { // 관리자 - 상품 Controller

	
	// 카테고리 목록 페이지
	@RequestMapping("/admin_cate_list.do")
	public ModelAndView listCate() {
		
		ModelAndView mav = new ModelAndView("admin/prod/cate_list");
		
		return mav;
	}
	
	
}
