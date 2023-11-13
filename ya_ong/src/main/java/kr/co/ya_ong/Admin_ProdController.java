package kr.co.ya_ong;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ya_ong.dto.Main_cateDTO;
import kr.co.ya_ong.dto.Sub_cateDTO;
import kr.co.ya_ong.service.AdminProdMapper;

@Controller
public class Admin_ProdController { // 관리자 - 상품 Controller

	@Autowired
	private AdminProdMapper adminProdMapper;
	
	// 카테고리 목록 페이지
	@RequestMapping("/admin_cate_list.do")
	public ModelAndView listCate() {
		
		ModelAndView mav = new ModelAndView("admin/prod/cate_list");
		// 대분류, 소분류 카테고리 목록 담기
		List<Main_cateDTO> listMainCate = adminProdMapper.listMainCate();
		mav.addObject("listMainCate", listMainCate);
//		List<Sub_cateDTO> listSubCate = adminProdMapper.listSubCate();
//		mav.addObject("listSubCate", listSubCate);
		return mav;
	}
	
	
}
