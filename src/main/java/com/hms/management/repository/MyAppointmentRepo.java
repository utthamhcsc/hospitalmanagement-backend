package com.hms.management.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hms.management.model.Appointment;
import com.hms.management.model.UserRegistration;

public interface MyAppointmentRepo extends JpaRepository<Appointment, Integer>{
	@Query("select new Map(a.id as id,a.aptId as aptId,a.patientId as patientId,a.date as date"
			+ ",a.patientName as patientName,a.gender as gender,a.email as email,a.mobileNumber as mobileNumber"
			+ ",a.address as address,a.doctorId as doctorId,a.message as message,a.appointmentStatus as appointmentStatus,"
			+ "s.firstName as doctorName"
			+ ") from Appointment a left join com.hms.management.humanresource.modal.Staff s "
			+ "on s.staffId=a.doctorId "
			+ "where a.patientId=?1")
List<?> fetchByPatientId(String patientId);
List<Appointment> findByDoctorId(String doctorId);
List<Appointment> findByPatientId(String patientId);
}
