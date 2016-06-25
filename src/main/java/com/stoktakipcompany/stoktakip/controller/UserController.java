package com.stoktakipcompany.stoktakip.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.stoktakipcompany.stoktakip.pojo.User;
import com.stoktakipcompany.stoktakip.service.UserService;




@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserService userS;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createNewUser(@ModelAttribute User user,
			final RedirectAttributes redirectAttributes) {

		ModelAndView mav = new ModelAndView();

	/*	String message = "New user " + user.getAdi()
				+ " was successfully created.";
*/
		
		userS.create(user);

	///	mav.setViewName("redirect:/index.html");

		mav.setViewName("User");
		
		//redirectAttributes.addFlashAttribute("message", message);

		return mav;

	}
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}

}
