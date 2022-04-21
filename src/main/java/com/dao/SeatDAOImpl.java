package com.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Seat;


@Component
public class SeatDAOImpl implements SeatDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
		public void bookSeat(Seat s) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(s);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public Seat searchSeat(int seatId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Seat s1=session.find(Seat.class, seatId);
		
		return  s1;
		
	}

	@Override
	public List<Seat> findAllSeat() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<Seat> seatlist=session.createQuery("select i from Seat i").list();
		
		return seatlist;
		
	}

	@Override
	public boolean updateSeat(Seat s) {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(s);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteSeat(int seatId) {
		Session session=sessionFactory.openSession();
		Seat s=session.find(Seat.class,seatId);
		session.getTransaction().begin();
		session.delete(s);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}




}
