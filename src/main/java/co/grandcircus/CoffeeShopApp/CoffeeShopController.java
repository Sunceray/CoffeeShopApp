package co.grandcircus.CoffeeShopApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CoffeeShopApp.Dao.ItemsDao;
import co.grandcircus.CoffeeShopApp.Dao.UserDao;


@Controller
public class CoffeeShopController {

	@Autowired
	ItemsDao itemsDao;
	
	@Autowired
	UserDao userDao;
	
    @RequestMapping("/")
	public ModelAndView showHome()   {
    	return new ModelAndView("index");
	}
    
    @RequestMapping("/registrationform")
	public ModelAndView showRegistration()   {
    	return new ModelAndView("registrationform");
	}
    
    @RequestMapping("/registrationpage")
    public ModelAndView showRegistrationPage() {
    	return new ModelAndView("registerationpage");
    
    }
    
	@RequestMapping("/list")	
	public ModelAndView showItemList() {
		List<Item> menu = itemsDao.findAll();
		System.out.println(menu);
		return new ModelAndView("itemList", "item", menu);
		//"itemList" is the view
		//"item" is the name of the variables you're looking to send
	}
	
	@RequestMapping("/results") 
	//@RequestMapping = a get method
	public ModelAndView showResults(User user)  {
		System.out.println(user);
		//previous page sent over information to results page as a object of user
		userDao.create(user);
		//communicating with the database to create a row in our database
		//getting info from the parameter to use in database 
		System.out.println(user);
		List<Item> item = itemsDao.findAll();
	    //tell the database to select all items in the table
		return new ModelAndView("Admin", "list", item);
	 	//tells the controller which page to pull up
		//"Admin" is the view
		// "list" is the name of the variable of the item you're looking to send
		//"item" are the values that are being passed to the next page
		
	}
		@RequestMapping("/edit")
		public ModelAndView showEdit() {
		return new ModelAndView("edit form");
	}
	    @PostMapping("/edit")
	    public ModelAndView showEdits()  {
	    return new ModelAndView("Edit");
   }
	
	    @PostMapping("delete")
	    public ModelAndView showDelete() {
	    return new ModelAndView("index");
	    
	}
	   // @RequestMapping()
	   // public ModelAndView 
	    
    }

    

