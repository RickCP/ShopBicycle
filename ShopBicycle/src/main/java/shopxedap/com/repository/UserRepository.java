package shopxedap.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shopxedap.com.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
}
