package org.zerock.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.boardVO;
import org.zerock.service.boardService;



@Controller
@RequestMapping("/board/") //board/ 로 시작하는 모든 처리는 여기서!
public class boardController {
	
	@Inject
	private boardService service;
	
	@RequestMapping(value = "/create", method=RequestMethod.GET)
	public void createGET(boardVO vo, Model model) throws Exception{
		
		System.out.println("/board/create 입니당! GET방식");
		
	}
	
	@RequestMapping(value = "/create", method=RequestMethod.POST)
	public String createPOST(boardVO vo, RedirectAttributes rttr) throws Exception{
		
		System.out.println("/board/create 입니당! POST방식");
		System.out.println(vo.toString());
		
		service.create(vo);
		rttr.addFlashAttribute("msg", "성공"); //url상에 보이지 않고, 한번만 사용되는 데이터가 된다!
		//model 사용시 리다이렉트를 해도 url에 계속 결과 남아있음
		//RedirectAttributes: 리다이렉트 시점에 한 번만 사용되는 데이터 만들 수 있다!
		
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value="/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception{
		
		System.out.println("전체목록 보여주기");
		
		model.addAttribute("boardList", service.listAll());
	}

}
