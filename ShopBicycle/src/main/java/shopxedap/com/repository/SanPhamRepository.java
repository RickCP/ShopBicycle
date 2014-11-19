package shopxedap.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import shopxedap.com.domain.SanPham;

public interface SanPhamRepository extends JpaRepository<SanPham, Integer>, SanPhamRepositoryCustom {
}
