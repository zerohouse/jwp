package next.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import next.dao.QuestionDao;
import next.model.Question;
import core.mvc.Controller;
import core.mvc.JstlView;
import core.mvc.ModelAndView;

public class ListController implements Controller {
	private QuestionDao questionDao = new QuestionDao();
	private List<Question> questions;
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		questions = questionDao.findAll();
		
		ModelAndView mav = new ModelAndView(new JstlView("list.jsp"));
		mav.addObject("questions", questions);
		return mav;
	}
}
