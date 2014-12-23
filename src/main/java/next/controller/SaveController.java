package next.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import next.dao.QuestionDao;
import next.model.Question;
import core.mvc.AbstractController;
import core.mvc.ModelAndView;

public class SaveController extends AbstractController {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		Question q = new Question(writer, title, contents);
		QuestionDao dao = new QuestionDao();
		dao.insert(q);
		ModelAndView mav = jstlView("save.jsp");
		mav.addObject("writer", writer);
		mav.addObject("title", title);
		mav.addObject("contents", contents);
		return mav;
	}

}
