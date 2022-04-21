package com.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Seat;
@Repository
public interface SeatDAO {
	public void bookSeat(Seat s);
	public Seat searchSeat(int seatId);
	public List<Seat> findAllSeat();
	public boolean updateSeat(Seat s);
	public boolean deleteSeat(int seatId);
	


}
