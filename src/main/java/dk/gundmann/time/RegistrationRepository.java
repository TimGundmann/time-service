package dk.gundmann.time;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

interface RegistrationRepository extends CrudRepository<Registration, String> {

    @Query("SELECT r.startTime WHERE REGISTRATION r where r.email = :email and endTime is null")
	Optional<LocalDateTime> findActiveByEmail(String email);

}