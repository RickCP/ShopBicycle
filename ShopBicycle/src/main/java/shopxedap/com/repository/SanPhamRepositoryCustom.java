package shopxedap.com.repository;

import java.math.BigDecimal;
import java.util.List;

import shopxedap.com.domain.SanPham;

public interface SanPhamRepositoryCustom {
	List<SanPham> filterSanPham(String loaiSP, String tenDM, BigDecimal giaFrom, BigDecimal giaTo);
}
