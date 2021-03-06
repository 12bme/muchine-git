package com.lgu.abc.core.prototype.org.company;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import com.lgu.abc.core.base.domain.query.BaseQuery;

@ToString(callSuper=true, includeFieldNames=true) @EqualsAndHashCode(callSuper=true)
public @Data class CompanyQuery extends BaseQuery {

	private String domain;
	
	private String primaryDomain;
	
}
