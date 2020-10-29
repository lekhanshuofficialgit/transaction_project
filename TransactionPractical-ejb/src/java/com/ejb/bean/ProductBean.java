/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejb.bean;

import com.ejb.remote.ProductRemote;
import com.jdbc.dao.ProductDAO;
import com.jdbc.entity.Product;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import static javax.ejb.TransactionManagementType.BEAN;
import javax.inject.Inject;
import javax.transaction.UserTransaction;

/**
 *
 * @author hppc--
 */
@Stateless
@TransactionManagement(BEAN)
public class ProductBean implements ProductRemote{
    @Resource
    private UserTransaction ut;
    
    @Inject
    private ProductDAO productDao;
    
    public void saveProduct(Product product) throws Exception {
        try {
            System.out.println("TRANSACTION HAS BEGIN");
            ut.begin();
            
            productDao.saveProduct(product);
            
            System.out.println("TRANSACTION HAS COMMIT");
            ut.commit();
        } catch (Exception e) {
            System.out.println("TRANSACTION HAS ");
            ut.rollback();
            System.out.println("EXCEPTION");
        }
    }
}