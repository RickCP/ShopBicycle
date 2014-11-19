package shopxedap.com.repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.springframework.util.StringUtils;

import shopxedap.com.domain.SanPham;

public class SanPhamRepositoryImpl extends BaseRepository implements SanPhamRepositoryCustom {
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SanPham> filterSanPham(String loaiSP, String tenDM, BigDecimal giaFrom, BigDecimal giaTo) {
		String queryString = "SELECT sp FROM SanPham sp {JOIN_LOAI_SP} {JOIN_DANH_MUC} {WHERE}";
		Map<String, Object> params = new HashMap<String, Object>();
		if (StringUtils.hasText(loaiSP)) {
			queryString = queryString.replace("{JOIN_LOAI_SP}", "JOIN sp.loaiSanPham lsp");
			queryString = queryString.replace("{WHERE}", "WHERE lsp.tenLoaiSp = :tenLoaiSP");
			params.put("tenLoaiSP", loaiSP);
		} else {
			queryString = queryString.replace("{JOIN_LOAI_SP}", "");
		}
		
		if (StringUtils.hasText(tenDM)) {
			queryString = queryString.replace("{JOIN_DANH_MUC}", "JOIN lsp.danhMuc dm");
			if (queryString.contains("{WHERE}")) {
				queryString = queryString.replace("{WHERE}", "WHERE dm.tenDm = :tenDm");
			} else {
				queryString += " AND dm.tenDm = :tenDm";
			}
			params.put("tenDm", tenDM);
		} else {
			queryString = queryString.replace("{JOIN_DANH_MUC}", "");
		}
		
		if (giaFrom != null && giaTo != null) {
			if (queryString.contains("{WHERE}")) {
				queryString = queryString.replace("{WHERE}", "WHERE sp.giaSp BETWEEN :giaFrom AND :giaTo");
			} else {
				queryString += " AND sp.giaSp BETWEEN :giaFrom AND :giaTo";
			}
			params.put("giaFrom", giaFrom);
			params.put("giaTo", giaTo);
		}
		
		if (queryString.contains("{WHERE}")) {
			queryString = queryString.replace("{WHERE}", "");
		}
		
		Query query = em.createQuery(queryString, SanPham.class);
		buildParamsForQuery(params, query);
		
		return query.getResultList();
	}
}
