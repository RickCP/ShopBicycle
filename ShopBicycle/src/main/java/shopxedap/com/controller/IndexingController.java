package shopxedap.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexingController {
	
	@RequestMapping("/guest")
	public String getGuestPage()
	{
		return "index";
	}
	
	@RequestMapping("/cart")
	public String getCartPage()
	{
		return "cart";
	}
	
	@RequestMapping("/orderItem")
	public String getOrderItemPage()
	{
		return "Copy of cart";
	}
	
	@RequestMapping("/checkOut")
	public String getCheckOutPage()
	{
		return "checkOut";
	}
	
	@RequestMapping("/about")
	public String getDemoPage()
	{
		return "about";
	}
	
	

}
