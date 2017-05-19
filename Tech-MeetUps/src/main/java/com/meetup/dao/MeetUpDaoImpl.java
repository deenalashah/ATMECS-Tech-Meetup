package com.meetup.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.meetup.model.MeetUps;

@Transactional
@Repository
public class MeetUpDaoImpl implements MeetUpDao {
	@Autowired
	private SessionFactory sf;

	public void addMeetUp(MeetUps meetup) {

		sf.getCurrentSession().save(meetup);

	}

	public List<MeetUps> viewMeetUps() {
		List<MeetUps> list = sf.getCurrentSession().createCriteria(MeetUps.class).list();

		return list;
	}

	public void updateMeetUp(MeetUps meetups) {
		sf.getCurrentSession().update(meetups);

	}

	public void DeleteMeetUp(int id) {
		MeetUps meetUp = (MeetUps) sf.getCurrentSession().get(MeetUps.class, new Integer(id));
		sf.getCurrentSession().delete(meetUp);
		
	}

	public List<MeetUps> viewMeetUpsByPresentor(String presentor) {
		
		String hql = "select m from MeetUps m where m.presentor=:presentor";

		List<MeetUps> meetUp = sf.getCurrentSession().createQuery(hql).setParameter("presentor", presentor).list();


		return meetUp;
	}

}
