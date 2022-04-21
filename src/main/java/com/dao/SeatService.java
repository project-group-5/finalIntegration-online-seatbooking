package com.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Seat;
@Service
public class SeatService {
	@Autowired
	SeatDAO seatDAOImpl;

	public void add(Seat s) {
		 seatDAOImpl.bookSeat(s);
		
	}
	public Seat find(int seatId) {
		return seatDAOImpl.searchSeat(seatId);
	}
	public List<Seat> findAll(){
		return seatDAOImpl.findAllSeat();
	}
	public boolean update(Seat s) {
		return seatDAOImpl.updateSeat(s);
	}
	public boolean delete(int seatId) {
		return seatDAOImpl.deleteSeat(seatId);

}


}
