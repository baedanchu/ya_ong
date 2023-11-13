package kr.co.ya_ong.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ya_ong.dto.Main_cateDTO;
import kr.co.ya_ong.dto.Sub_cateDTO;

@Service
public class AdminProdMapper { // 상품
	
	@Autowired
	private SqlSession sqlSession;
	
	// 대분류 카테고리 목록
	public List<Main_cateDTO> listMainCate(){
		return sqlSession.selectList("adminMainCateList");
	}
	// 소분류 카테고리 목록
//	public List<Sub_cateDTO> listSubCate(){
//		List<Sub_cateDTO> listSubCate = sqlSession.selectList("adminSubCateList");
//		
//		for(Sub_cateDTO cdto : listSubCate) {
//			// 소분류 카테고리가 가지고 있는 대분류 카테고리번호로, 해당 대분류 카테고리이름을 찾아서, 소분류 dto 에 set 하기
//			cdto.setMain_cate_name(sqlSession.selectOne("adminGetMainCate", cdto.getMain_cate_num()));
//		}
//		return listSubCate;
//	}

}
