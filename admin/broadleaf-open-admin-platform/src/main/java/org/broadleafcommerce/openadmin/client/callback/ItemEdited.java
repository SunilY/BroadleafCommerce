/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.openadmin.client.callback;

import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.data.Record;

/**
 * 
 * @author jfischer
 *
 */
public class ItemEdited {

	private Record record;
	private DataSource dataSource;

	public ItemEdited(Record record, DataSource dataSource) {
		this.record = record;
		this.dataSource = dataSource;
	}

	public Record getRecord() {
		return record;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}

}
