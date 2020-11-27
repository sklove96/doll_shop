package org.zerock.dao;

import java.util.List;

import org.zerock.domain.boardVO;

public interface boardDAO {
	
	public void create(boardVO vo) throws Exception;
	
	public List<boardVO> listAll() throws Exception;
	
	public boardVO read(Integer bno) throws Exception;
	
	public void delete(Integer bno) throws Exception;
	
	public void update(boardVO vo) throws Exception;
	

}
