/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.remote;

import com.jdbc.entity.Product;

/**
 *
 * @author hppc--
 */
public interface ProductRemote {
    public void saveProduct(Product product) throws Exception;
}