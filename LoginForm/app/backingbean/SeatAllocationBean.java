package backingbean;

import java.util.ArrayList;
import java.util.List;

import model.Seat;

public class SeatAllocationBean {
private List<Seat> seatList = new ArrayList<Seat>();

public SeatAllocationBean showSeatDetails(){
	SeatAllocationBean seatAllocationBean = new SeatAllocationBean();
	seatList.add(new Seat("1","add1","001","emp1"));
	seatList.add(new Seat("2","add2","002","emp2"));
	seatList.add(new Seat("3","add3","003","emp3"));
	seatAllocationBean.setSeatList(seatList);
	return seatAllocationBean;
}




public List<Seat> getSeatList() {
	return seatList;
}

public void setSeatList(List<Seat> seatList) {
	this.seatList = seatList;
}

}
