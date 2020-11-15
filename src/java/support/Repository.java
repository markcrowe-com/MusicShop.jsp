/*
 * Copyright (c) 2020 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package support;

import java.util.List;

public interface Repository<T>
{
	T createItem(T item);
	int deleteItemById(int id);
	T getItemById(int id);
	List<T> getItems();
	T updateItem(T item, int itemId);
}
