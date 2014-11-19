package shopxedap.com.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import shopxedap.com.domain.SanPham;
import shopxedap.com.repository.SanPhamRepository;

@Controller

public class IndexingController {
	
	@Autowired 
	SanPhamRepository sanPhamRepository;
	
	@RequestMapping("/guest")
	public String getGuestPage()
	{
		BigDecimal giaFrom = new BigDecimal(2000000);
		BigDecimal giaTo = new BigDecimal(10000000);
		List<SanPham> sanPhams = sanPhamRepository.filterSanPham("Touring", "Xe đạp", giaFrom, giaTo);
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
		return "orderItem";
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
