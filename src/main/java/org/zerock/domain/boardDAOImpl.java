package org.zerock.domain;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.dao.boardDAO;

@Repository
public class boardDAOImpl implements boardDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "org.zerock.mapper.BoardMapper";
	
	//게시판 추가
	@Override
	public void create(boardVO vo) throws Exception {
		
		sqlSession.insert(namespace + ".insertBoard", vo); 
		
	}

	//게시판 보기
	@Override
	public List<boardVO> listAll() throws Exception {
		
		return sqlSession.selectList(namespace + ".listBoard");
		/* return null; */
	}
	
	//게시판 상세
	@Override
	public boardVO read(Integer bno) throws Exception {
		
		sqlSession.selectOne(namespace + ".detailBoard", bno);
		return null;
	}

	//게시판 삭제
	@Override
	public void delete(Integer bno) throws Exception {
		
		sqlSession.delete(namespace + ".deleteBoard", bno);
		
	}

	//게시판 수정
	@Override
	public void update(boardVO vo) throws Exception {
		
		sqlSession.update(namespace + ".updateBoard", vo);
		
	}

	

}
