package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.seatDetails;
import backingbean.SeatAllocationBean;

public class SeatAllocationDetailsController extends Controller{
	
	
	public static Result showSeatDetails(){
		SeatAllocationBean bean = new SeatAllocationBean();
		bean = bean.showSeatDetails();
		
		return ok(seatDetails.render(bean.getSeatList()));
	}

}
