package com.awei.uml.Implementation;

/**
 * TODO
 *
 * @author a_wei
 * @version 1.0
 * @date 2021/10/12 13:56
 */
public interface PersonService {
    public void delete(Integer id);
}

class PersonServiceBean implements PersonService{

    @Override
    public void delete(Integer id) {
    }
}