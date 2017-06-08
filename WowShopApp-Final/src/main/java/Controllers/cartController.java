package Controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ShopID.Dao.cartDao;
import ShopID.Dao.categoryDao;
import ShopID.Dao.productDao;
import ShopID.Model.cartModel;
import ShopID.Model.productModel;

@Controller
public class cartController {
	
	@Autowired
	productDao sdao;
	
	@Autowired
	cartDao cdao;
	
	@RequestMapping("/viewCart")
	public ModelAndView viewCart(){
		
		ModelAndView mv=new ModelAndView("viewCart");
		List<cartModel> cartList=cdao.getAll();
		
		mv.addObject("cartlist", cartList);
		return mv;
	}
	
	@RequestMapping("/addCart")
	public ModelAndView addCart(HttpServletRequest request){
		String id=request.getParameter("id");
		int q=Integer.valueOf(request.getParameter("q"));
		
		productModel p=sdao.getproduct(id);
		int price=(int) p.getPrice();
		cartModel c=new cartModel();
		c.setPrices(price);
	   
		c.setQuantity(q);
		
		c.setCartid(1);
		c.setProductid(p);
		/* added from here*/
		List<cartModel> list=cdao.checkExistance(Integer.parseInt(id));
		int count=list.size();
		System.out.println("No of times: "+count);
		if(count==0)
		{
			cdao.save(c);
		}
		else
		{
			//cartModel cart=cdao.getId(list.get(0).);
			cartModel cart=cdao.getId(list.get(0).getCartid());
					
					//cdao.findById(list.get(0).getCart_id());

			int ex=cart.getQuantity();
			System.out.println("-----------Existance Count ="+ex+"\n current Count = "+q+"------------\n---Total =-"+(ex+q));
			int tot=ex+q;
			cart.setQuantity(tot);
			cdao.update(cart);
		}
		
		/* added till  here*/
		cdao.save(c);
		
		System.out.println(c);
		
		ModelAndView mv=new ModelAndView("cartView");
		List<cartModel> cartList=cdao.getAll();
		
		mv.addObject("cartlist", cartList);
		return mv;
		
	}
	
	@RequestMapping("/customerDetails")
	public ModelAndView customer(HttpServletRequest request)
	{
		Double tot= Double.parseDouble(request.getParameter("tot"));
		
		ModelAndView mv=new ModelAndView("customerregistration");
		mv.addObject("tot", tot);
		return mv;
	}
   
   @RequestMapping("/invoice")
	public ModelAndView invoice(HttpServletRequest request)
	{
		String name=request.getParameter("name");
		String add=request.getParameter("add");
		String phone=request.getParameter("contact_no");
		String email=request.getParameter("email");
		String tot=request.getParameter("tot");
		ModelAndView mv=new ModelAndView("invoice");
		mv.addObject("name", name);
		mv.addObject("add", add);
		mv.addObject("phone", phone);
		mv.addObject("email", email);
		mv.addObject("tot", tot);
		
	
		return mv;
	}

	
   @RequestMapping("/cart_delete")
   public ModelAndView editCart(HttpServletRequest request)
   {
   int cid=Integer.valueOf(request.getParameter("id"));
  //  cartModel c=cdao.getId(cid);
   cdao.deleteById(cid);
   ModelAndView mv=new ModelAndView("cartView");
   List<cartModel> cartList=cdao.getAll();
   mv.addObject("cartlist", cartList);
   return mv;
   }

   
}
