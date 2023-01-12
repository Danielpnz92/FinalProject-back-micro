package FinalProject.Microservice.repository;

import FinalProject.Microservice.model.HelpSection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelpSectionRepository extends JpaRepository<HelpSection, Integer> {
}
