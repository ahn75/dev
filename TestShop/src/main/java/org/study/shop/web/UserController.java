package org.study.shop.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.study.shop.web.UserController;
import org.study.shop.dao.UserDAO;
import org.study.shop.model.User;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserDAO dao;
	
	@RequestMapping("/list")
	public String listAll(Model model) {
		logger.info("list was called");
		
		try {
			List<User> list = dao.listAll();
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "list";
	}
	
	@RequestMapping("user")
	public String register() {
		logger.info("/register was called");
		return "register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String proRegister(User user, RedirectAttributes rttr) {
		logger.info("/register post was called : " + user );
		// database process
		try {
			dao.create(user);
			rttr.addFlashAttribute("msg", "success");
			
		} catch (Exception e) {
			rttr.addFlashAttribute("msg", "failure");
			e.printStackTrace();
			
		}
		
		return "redirect:list";
	}
	
	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String remove(User id, RedirectAttributes rttr) {
		logger.info("remove was called : " + id);
		
		try {
			dao.delete(id);
			rttr.addFlashAttribute("msg", "success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rttr.addFlashAttribute("mag", "failure");
		}
		
		return "redirect:/list";
		
	}
	
}
