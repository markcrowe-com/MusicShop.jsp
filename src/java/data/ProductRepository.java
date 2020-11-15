/*
 * Copyright (c) 2020 Mark Crowe <https://github.com/markcrowe-com>. All rights reserved.
 */
package data;

import business.Product;
import java.util.List;

public interface ProductRepository
{
	Product getProduct(String code);
	List<Product> getProducts(String filepath);
}
