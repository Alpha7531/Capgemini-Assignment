package com.doctor.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.models.AuthenticationRequest;
import com.doctor.models.AuthenticationResponse;
import com.doctor.models.Doctor;
import com.doctor.repository.DoctorRepository;
import com.doctor.services.DoctorService;
import com.doctor.services.JwtUtils;

@RestController
@RequestMapping("/register")
public class DoctorController {

	@Autowired
	private DoctorRepository doctorRepository;

	@Autowired
	private DoctorService doctorService;

	@Autowired
	private JwtUtils jwtUtils;

	@Autowired
	private AuthenticationManager authenticationManager;
//---------------------------Registration and Login -------------------------------//

	@PostMapping("/reg")
	private ResponseEntity<?> subscribeClient(@RequestBody AuthenticationRequest authenticationRequest) {
		String name = authenticationRequest.getName();
		String username = authenticationRequest.getUsername();
		String password = authenticationRequest.getPassword();
		String emailid = authenticationRequest.getEmail();
		String contactno = authenticationRequest.getContact();
		Doctor doctor = new Doctor();
		doctor.setName(name);
		doctor.setUsername(username);
		doctor.setPassword(password);
		doctor.setContact(contactno);
		doctor.setEmail(emailid);
		try {
			doctorRepository.save(doctor);
		}

		catch (Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse("Error During Auth for Doctor" + username));
		}
		return ResponseEntity.ok(new AuthenticationResponse("Successful Auth " + username));
	}

	@PostMapping("/auth")
	private ResponseEntity<?> authenticateClient(@RequestBody AuthenticationRequest authenticationRequest) {
		String username = authenticationRequest.getUsername();
		String password = authenticationRequest.getPassword();

		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (Exception e) {
			return ResponseEntity.ok(new AuthenticationResponse("Error while authenticating" + username));
		}

		UserDetails loadedUser = doctorService.loadUserByUsername(username);
		String generatedToken = jwtUtils.generateToken(loadedUser);
		return ResponseEntity.ok(new AuthenticationResponse(generatedToken));
	}

}