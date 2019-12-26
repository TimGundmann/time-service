package dk.gundmann.time;

import java.security.Principal;
import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    private RegistrationService service;

	RegistrationController(RegistrationService service) {
		this.service = service;
    }


    @GetMapping("/start")
	public void start() {
		
	}

    @GetMapping("/active")
	public LocalDateTime active(Principal principal) {
		return this.service.active(principal.getName()).get();
	}

    @GetMapping("/stop")
	public void stop() {
		
	}

}