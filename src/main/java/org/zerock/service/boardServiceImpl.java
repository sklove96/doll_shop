package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.zerock.dao.boardDAO;
import org.zerock.domain.boardVO;


@Service
public class boardServiceImpl implements boardService{
	
	@Inject
	private boardDAO dao;

	@Override
	public void create(boardVO vo) throws Exception {
		dao.create(vo);
		
	}

	@Override
	public List<boardVO> listAll() throws Exception {
		
		return dao.listAll();
	}

	@Override
	public boardVO read(Integer bno) throws Exception {
		
		return dao.read(bno);
	}

	@Override
	public void delete(Integer bno) throws Exception {
		dao.delete(bno);
		
	}

	@Override
	public void update(boardVO vo) throws Exception {
		dao.update(vo);
	}

}
