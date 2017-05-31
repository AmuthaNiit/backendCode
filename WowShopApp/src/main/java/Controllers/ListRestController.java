package Controllers;


	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.ResponseBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.google.gson.Gson;
	import com.google.gson.GsonBuilder;

import ShopID.Dao.categoryDao;
import ShopID.Dao.supplierDao;
		
	
	@RestController
	public class ListRestController 
	{
		@Autowired
		private categoryDao category;
		@Autowired
		private supplierDao supplier;
		
		@RequestMapping(value="/categorys", method=RequestMethod.GET)
		public @ResponseBody String getAll(){
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String json = gson.toJson(category.listData());
	        
	    
	        return json;
		}
	    
		@RequestMapping(value="/suppliers", method=RequestMethod.GET)
		public @ResponseBody String getSave()
		{
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String json = gson.toJson(supplier.listData());
	        return json;
		}
		
	}



