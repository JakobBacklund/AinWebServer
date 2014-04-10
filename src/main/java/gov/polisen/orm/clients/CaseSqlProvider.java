package gov.polisen.orm.clients;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import gov.polisen.orm.examples.CaseExample;
import gov.polisen.orm.examples.CaseExample.Criteria;
import gov.polisen.orm.examples.CaseExample.Criterion;
import gov.polisen.orm.models.Case;
import java.util.List;

public class CaseSqlProvider {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cases
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public String countByExample(CaseExample example) {
		BEGIN();
		SELECT("count(*)");
		FROM("cases");
		applyWhere(example, false);
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cases
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public String insertSelective(Case record) {
		BEGIN();
		INSERT_INTO("cases");
		if (record.getDeviceid() != null) {
			VALUES("deviceid", "#{deviceid,jdbcType=INTEGER}");
		}
		if (record.getCaseid() != null) {
			VALUES("caseid", "#{caseid,jdbcType=INTEGER}");
		}
		if (record.getAuthor() != null) {
			VALUES("author", "#{author,jdbcType=INTEGER}");
		}
		if (record.getModificationtime() != null) {
			VALUES("modificationtime", "#{modificationtime,jdbcType=TIMESTAMP}");
		}
		if (record.getFirstrevisioncaseid() != null) {
			VALUES("firstrevisioncaseid", "#{firstrevisioncaseid,jdbcType=INTEGER}");
		}
		if (record.getFirstrevisiondeviceid() != null) {
			VALUES("firstrevisiondeviceid",
					"#{firstrevisiondeviceid,jdbcType=INTEGER}");
		}
		if (record.getDeletiontime() != null) {
			VALUES("deletiontime", "#{deletiontime,jdbcType=TIMESTAMP}");
		}
		if (record.getClassification() != null) {
			VALUES("classification", "#{classification,jdbcType=SMALLINT}");
		}
		if (record.getStatus() != null) {
			VALUES("status", "#{status,jdbcType=SMALLINT}");
		}
		if (record.getPriority() != null) {
			VALUES("priority", "#{priority,jdbcType=SMALLINT}");
		}
		if (record.getLongitude() != null) {
			VALUES("longitude", "#{longitude,jdbcType=REAL}");
		}
		if (record.getLatitude() != null) {
			VALUES("latitude", "#{latitude,jdbcType=REAL}");
		}
		if (record.getTimeofcrime() != null) {
			VALUES("timeofcrime", "#{timeofcrime,jdbcType=TIMESTAMP}");
		}
		if (record.getDescription() != null) {
			VALUES("description", "#{description,jdbcType=VARCHAR}");
		}
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cases
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	public String selectByExample(CaseExample example) {
		BEGIN();
		if (example != null && example.isDistinct()) {
			SELECT_DISTINCT("deviceid");
		} else {
			SELECT("deviceid");
		}
		SELECT("caseid");
		SELECT("author");
		SELECT("modificationtime");
		SELECT("firstrevisioncaseid");
		SELECT("firstrevisiondeviceid");
		SELECT("deletiontime");
		SELECT("classification");
		SELECT("status");
		SELECT("priority");
		SELECT("longitude");
		SELECT("latitude");
		SELECT("timeofcrime");
		SELECT("description");
		FROM("cases");
		applyWhere(example, false);
		if (example != null && example.getOrderByClause() != null) {
			ORDER_BY(example.getOrderByClause());
		}
		return SQL();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cases
	 * @mbggenerated  Thu Apr 03 15:37:03 CEST 2014
	 */
	protected void applyWhere(CaseExample example, boolean includeExamplePhrase) {
		if (example == null) {
			return;
		}
		String parmPhrase1;
		String parmPhrase1_th;
		String parmPhrase2;
		String parmPhrase2_th;
		String parmPhrase3;
		String parmPhrase3_th;
		if (includeExamplePhrase) {
			parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		} else {
			parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
			parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
			parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
			parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
			parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
			parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
		}
		StringBuilder sb = new StringBuilder();
		List<Criteria> oredCriteria = example.getOredCriteria();
		boolean firstCriteria = true;
		for (int i = 0; i < oredCriteria.size(); i++) {
			Criteria criteria = oredCriteria.get(i);
			if (criteria.isValid()) {
				if (firstCriteria) {
					firstCriteria = false;
				} else {
					sb.append(" or ");
				}
				sb.append('(');
				List<Criterion> criterions = criteria.getAllCriteria();
				boolean firstCriterion = true;
				for (int j = 0; j < criterions.size(); j++) {
					Criterion criterion = criterions.get(j);
					if (firstCriterion) {
						firstCriterion = false;
					} else {
						sb.append(" and ");
					}
					if (criterion.isNoValue()) {
						sb.append(criterion.getCondition());
					} else if (criterion.isSingleValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase1, criterion.getCondition(), i,
									j));
						} else {
							sb.append(String.format(parmPhrase1_th, criterion.getCondition(),
									i, j, criterion.getTypeHandler()));
						}
					} else if (criterion.isBetweenValue()) {
						if (criterion.getTypeHandler() == null) {
							sb.append(String.format(parmPhrase2, criterion.getCondition(), i,
									j, i, j));
						} else {
							sb.append(String.format(parmPhrase2_th, criterion.getCondition(),
									i, j, criterion.getTypeHandler(), i, j,
									criterion.getTypeHandler()));
						}
					} else if (criterion.isListValue()) {
						sb.append(criterion.getCondition());
						sb.append(" (");
						List<?> listItems = (List<?>) criterion.getValue();
						boolean comma = false;
						for (int k = 0; k < listItems.size(); k++) {
							if (comma) {
								sb.append(", ");
							} else {
								comma = true;
							}
							if (criterion.getTypeHandler() == null) {
								sb.append(String.format(parmPhrase3, i, j, k));
							} else {
								sb.append(String.format(parmPhrase3_th, i, j, k,
										criterion.getTypeHandler()));
							}
						}
						sb.append(')');
					}
				}
				sb.append(')');
			}
		}
		if (sb.length() > 0) {
			WHERE(sb.toString());
		}
	}
}