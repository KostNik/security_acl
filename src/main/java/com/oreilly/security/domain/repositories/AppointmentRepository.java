package com.oreilly.security.domain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oreilly.security.domain.entities.Appointment;
import com.oreilly.security.domain.entities.AutoUser;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	public List<Appointment> findByUser(AutoUser user);
}
