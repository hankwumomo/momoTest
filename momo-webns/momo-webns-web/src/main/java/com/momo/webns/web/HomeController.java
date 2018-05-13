package com.momo.webns.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.momo.webns.web.demo.RoomService;
@Controller
public class HomeController {

	@Autowired
	private ApplicationContext appContext;
	
	@RequestMapping(value = "/")
	public String index() {
		
		return "index";
	}

	 private RoomService roomServices;

	    @Autowired
	    public HomeController(RoomService roomServices){
	        super();
	        this.roomServices = roomServices;
	    }

	    @GetMapping(value="rooms")
	    public String getAllRooms(Model model){
	        model.addAttribute("rooms", this.roomServices.getAllRooms());
	        return "rooms";
	    }
	
}
// end::code[]