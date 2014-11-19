package shopxedap.com.repository;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class BaseRepository {
	@PersistenceContext
	protected EntityManager em;
	

	protected void buildParamsForQuery(Map<String, Object> params, Query query) {
		for (Map.Entry<String, Object> entry : params.entrySet()) {
			query.setParameter(entry.getKey(), entry.getValue());
		}
	}
}
