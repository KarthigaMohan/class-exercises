/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.Dao;

import jdbc.model.StudentBean;

/**
 *
 * @author test
 */
public interface StudentDao {
    public boolean insertData(StudentBean s) throws Exception;
}
