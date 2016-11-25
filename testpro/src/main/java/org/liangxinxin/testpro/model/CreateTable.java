package org.liangxinxin.testpro.model;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CreateTable {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		SchemaExport se = new SchemaExport(configuration);
		se.create(true, true);
	}

}
