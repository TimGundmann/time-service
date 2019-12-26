package dk.gundmann.time;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private RegistrationRepository repository;

    RegistrationService(RegistrationRepository repository) {
        this.repository = repository;
    }

    public Optional<LocalDateTime> active(String email) {
        return this.repository.findActiveByEmail(email);
    }

}