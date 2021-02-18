package com.aniruddha.scloud.controller.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ModelAndView handleMyException(Exception mex) {

		ModelAndView model = new ModelAndView();
		model.addObject("errCode", 500);
		model.addObject("errMsg", mex.getMessage());
		model.setViewName("error/generic_error");
		return model;
	}
}
