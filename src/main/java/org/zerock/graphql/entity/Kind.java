package org.zerock.graphql.entity;


import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Kind")
public class Kind {

	private String kind_code;
	private String kind_name;
	
	public Kind() {
		
	}
	
	public String getKind_code() {
		return kind_code;
	}
	
	public void setKind_code() {
		this.kind_code = kind_code;
	}
}
