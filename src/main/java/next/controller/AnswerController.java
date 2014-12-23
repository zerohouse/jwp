package next.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import next.dao.AnswerDao;
import next.dao.QuestionDao;
import next.model.Answer;
import core.mvc.AbstractController;
import core.mvc.JsonView;
import core.mvc.ModelAndView;
import core.utils.ServletRequestUtils;

public class AnswerController extends AbstractController {

	@Override
	public ModelAndView execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String writer = request.getParameter("writer");
		long questionId = ServletRequestUtils.getRequiredLongParameter(request,
				"questionId");
		String contents = request.getParameter("contents");
		Answer a = new Answer(writer, contents, questionId);
		AnswerDao dao = new AnswerDao();
		QuestionDao qdao = new QuestionDao();
		qdao.addComment(questionId);
		dao.insert(a);
		ModelAndView mav = new ModelAndView(new JsonView());
		return mav;
	}

}
