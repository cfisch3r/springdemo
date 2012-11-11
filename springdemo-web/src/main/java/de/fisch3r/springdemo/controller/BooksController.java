package de.fisch3r.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import de.fisch3r.springdemo.dao.BookDao;

@Controller
@RequestMapping("/books")
public class BooksController {
	private static final String CATALOG_VIEW_NAME = "catalog";

	private static final String MODEL_ATTRIBUTE_NAME = "result";

	private BookDao bookDao;

	@Autowired
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView get(
			@RequestParam(value = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(value = "pageSize", required = false, defaultValue = "5") int pageSize) {
		ModelAndView mav = new ModelAndView(CATALOG_VIEW_NAME);
		mav.addObject(MODEL_ATTRIBUTE_NAME, bookDao.getPagesList(pageNumber, pageSize));

		return mav;
	}
}
