package com.project.learningplatform.controllers;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller

@RequestMapping("/")

public class HomeControllers {

	@RequestMapping("")

	public String index() {

		return "index";

	}

	@RequestMapping("/m/{chapter}/0553/{lesson}")

	public String lesson(Model model, @PathVariable("lesson") String lesson, @PathVariable("chapter") String chapter) {

		String content = "";

		if(chapter.equals("38")) {

			if (lesson.equals("0733")) {

				content ="Chapter "+chapter+ " Setting up your servers";

			} else if (lesson.equals("0342")) {

				content ="Chapter "+chapter+" Punch Cards";

			}

		}else if (chapter.equals("26")) {

			if (lesson.equals("0348")) {

			content ="Chapter "+chapter + " Advanced Fortran Intro";

			}

		}

		model.addAttribute("content", content);

		return "lesson";

	}

	@RequestMapping("/m/{chapter}/0483/{assignment}")

	public String showAssignment(Model model, @PathVariable("assignment") String assignment, @PathVariable("chapter") String chapter) {

		String content = "";

		if(chapter.equals("38")) {

			if (assignment.equals("0345")) {

				content = "Chapter "+chapter +" Coding Forms";

			}

		}

		if(chapter.equals("26")) {

			if (assignment.equals("2342")) {

				content = "Chapter "+chapter+" Fortran to Binary";

			}

		}

		model.addAttribute("content", content);

		return "assignment";

	}

	



}