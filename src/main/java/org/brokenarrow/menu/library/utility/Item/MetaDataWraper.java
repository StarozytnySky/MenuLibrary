package org.brokenarrow.menu.library.utility.Item;

import java.util.LinkedHashMap;
import java.util.Map;

public final class MetaDataWraper {
	private final Map<String, Object> itemMetaMap = new LinkedHashMap<>();

	public static MetaDataWraper of() {
		return new MetaDataWraper();
	}

	/**
	 * Add metadata to your item. To get the metadata with method {@link #getMetaDataMap()}
	 * This method will convert value to string always, use {@link #add(String, Object, boolean)}
	 * if you want to keep all data on the value.
	 *
	 * @param key   key to get the value.
	 * @param value value you has set .
	 * @return this class
	 */

	public MetaDataWraper add(String key, Object value) {
		return add(key, value, false);
	}

	/**
	 * Add metadata to your item. To get the metadata with method {@link #getMetaDataMap()}
	 *
	 * @param key           key to get the value.
	 * @param value         value you has set.
	 * @param keepClazzData true if it shall keep all data on the item or false to convert value to string.
	 * @return this class
	 */
	public MetaDataWraper add(String key, Object value, boolean keepClazzData) {
		itemMetaMap.put(key, (keepClazzData ? value + "" : value));
		return this;
	}

	public Map<String, Object> getMetaDataMap() {
		return itemMetaMap;
	}

}
